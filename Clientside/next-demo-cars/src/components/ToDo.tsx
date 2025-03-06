import { Item } from '@/types/types'
import React from 'react'

type Props = {
    toDo: Item
}

const ToDo = (props: Props) => {
    return (
        <div className='border-solid border-1 m-1'>
            <div>{props.toDo.name}</div>
            <div>{props.toDo.description}</div>
        </div>
    )
}

export default ToDo