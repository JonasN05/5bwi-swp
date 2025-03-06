import { Item } from '@/types/types'
import React from 'react'

type Props = {
    toDo: Item
}

const ToDo = (props: Props) => {
    return (
        <div className='border-solid border-1 m-2 p-5 w-xl flex flex-col rounded-2xl'>
            <div className='font-bold mb-2'>{props.toDo.id}</div>
            <div className='font-bold'>{props.toDo.name}</div>
            <div>{props.toDo.description}</div>
        </div>
    )
}

export default ToDo