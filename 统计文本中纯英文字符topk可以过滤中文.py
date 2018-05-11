# coding=utf-8
import re

__author__ = "wo"



def is_chinese(uchar):
    '判断一个unicode字符是不是中文,利用范围判断'
    if uchar >= u'\u4e00' and uchar <= u'\u9fa5':
        return True
    return False


def contain_chinese(ustr):
    '判断一个unicode字符串是否有中文'
    for uchar in ustr:
        if is_chinese(uchar):
            return True
    else:
        return False


def strip_symbols(line):
    '使用正则表达式'
    return re.sub(u'[!@#$%^&*()+`~.{}]+',"",line)



def count_words(filename):
    '统计文件中非中文的单词使用频率'
    import collections
    words_count = collections.Counter()

    with open(filename, 'rb') as fp:
        for line in fp:
            line = line.decode('utf-8').strip()
            if contain_chinese(line):
                continue
                
            line=strip_symbols(line)#删除标点符号
            line=line.lower()
            # 此处的update是自动更新Counter()
            words_count.update(re.split('\s+', line))
    return dict(words_count)


def get_top(filename, topk=10):
    words_dict = count_words(filename)
    top_words = sorted(words_dict.items(), key=lambda p: p[1], reverse=True)

    return top_words[:topk]


if '__main__' == __name__:
    import sys

    if len(sys.argv) != 3:
        print >> sys.stderr, 'Usage: {} filename topk'.format(sys.argv[0])
        sys.exit(1)
    topwords = get_top(sys.argv[1], int(sys.argv[2]))

    for word, count in topwords:
        print word, count
