import React from 'react'
import CarContainer from "../../components/CarContainer"

type Props = {}

const page = (props: Props) => {
    return (
        <div className='flex justify-center'>
            <CarContainer></CarContainer>
        </div>
    )
}

export default page