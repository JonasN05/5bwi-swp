import { Motor } from '@/types/types'
import React from 'react'

type Props = {
    motor: Motor
}

const EngineCard = (props: Props) => {
    return (
        <div className='bg-yellow-50 flex'>
            <div className='p-2'> {props.motor.name}</div>
            <div className='p-2'> {props.motor.horsepower}</div>
        </div>
    )
}

export default EngineCard