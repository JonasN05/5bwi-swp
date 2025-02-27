import Link from 'next/link'
import React from 'react'

type Props = {}

const Menu = (props: Props) => {
    return (
        <div>
            <ul className='flex '>
                <li className='p-2 hover:bg-amber-100'>
                    <Link href="/cars">Cars</Link >
                </li>
                <li className='p-2 hover:bg-amber-100'>
                    <Link href="/trucks">Trucks</Link >
                </li>
            </ul>
        </div>
    )
}

export default Menu
