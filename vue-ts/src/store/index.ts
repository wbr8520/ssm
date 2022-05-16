// store.ts
import {InjectionKey} from 'vue'
import {createStore, Store, useStore as baseUseStore} from 'vuex'

export interface State {
    count: number
}

export const key: InjectionKey<Store<State>> = Symbol()

export const store = createStore<State>({
    state: {
        count: 0
    }
})

// 定义自己的 `useStore` 组合式函数
export function useStore() {
    return baseUseStore(key)
}