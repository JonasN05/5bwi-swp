import { Car } from '@/types/types'
import React from 'react'

type Props = {
    car: Car,
}

const CarInformation = (props: Props) => {
    return (
        <div className='mb-2'>
            <div className='font-bold'>{props.car.carName}</div>
            <div>Marke: {props.car.brand}</div>
            <div>Farbe: {props.car.color}</div>
        </div>
    )
}

export default CarInformation