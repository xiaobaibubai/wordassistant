import request from '@/utils/request'

// 查询全部单词列表
export function listWord(query) {
  return request({
    url: '/app/word/list',
    method: 'get',
    params: query
  })
}

// 查询全部单词详细
export function getWord(id) {
  return request({
    url: '/app/word/' + id,
    method: 'get'
  })
}

// 新增全部单词
export function addWord(data) {
  return request({
    url: '/app/word',
    method: 'post',
    data: data
  })
}

// 修改全部单词
export function updateWord(data) {
  return request({
    url: '/app/word',
    method: 'put',
    data: data
  })
}

// 删除全部单词
export function delWord(id) {
  return request({
    url: '/app/word/' + id,
    method: 'delete'
  })
}

// 导出全部单词
export function exportWord(query) {
  return request({
    url: '/app/word/export',
    method: 'get',
    params: query
  })
}