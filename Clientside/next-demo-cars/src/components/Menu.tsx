import Link from 'next/link'
import React from 'react'

type Props = {}

const Menu = (props: Props) => {
    return (
        <div>
            <li>
                <Link href="/cars">Cars</Link >
            </li>
            <li>
                <Link href="/trucks">Trucks</Link >
            </li>
        </div>
    )
}

export default Menu
