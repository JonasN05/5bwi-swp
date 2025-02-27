import { Car } from '@/types/types'
import React from 'react'

type Props = {
    car: Car,
}

const CarCard = (props: Props) => {
    return (
        <div className='bg-emerald-100 border p-3 m-6 w-full'>
            {props.car.carName},
            {props.car.brand},
            {props.car.color},
            {props.car.motor.name},
            {props.car.motor.horsepower},
        </div>
    )
}

export default CarCard