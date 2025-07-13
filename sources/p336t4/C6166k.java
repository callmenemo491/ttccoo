package p336t4;

/* renamed from: t4.k */
/* loaded from: classes.dex */
public final class C6166k {

    /* renamed from: a */
    public static final int[] f23858a = null;

    static {
            r0 = 29
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686} // fill-array
            p336t4.C6166k.f23858a = r0
            return
    }

    /* renamed from: a */
    public static boolean m12732a(p216m4.InterfaceC4365j r22, boolean r23, boolean r24) {
            r0 = r22
            long r1 = r22.mo9786a()
            r3 = 4096(0x1000, double:2.0237E-320)
            r5 = -1
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L14
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 <= 0) goto L13
            goto L14
        L13:
            r3 = r1
        L14:
            int r4 = (int) r3
            v5.u r3 = new v5.u
            r8 = 64
            r3.<init>(r8)
            r8 = 0
            r9 = 0
            r10 = 0
        L1f:
            r11 = 1
            if (r9 >= r4) goto Lfc
            r12 = 8
            r3.m13392B(r12)
            byte[] r13 = r3.f25710a
            boolean r13 = r0.mo9793m(r13, r8, r12, r11)
            if (r13 != 0) goto L31
            goto Lfc
        L31:
            long r13 = r3.m13419v()
            int r15 = r3.m13403f()
            r16 = 1
            r11 = 16
            int r18 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r18 != 0) goto L4e
            byte[] r13 = r3.f25710a
            r0.mo9795o(r13, r12, r12)
            r3.m13395E(r11)
            long r13 = r3.m13411n()
            goto L67
        L4e:
            r16 = 0
            int r11 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r11 != 0) goto L65
            long r16 = r22.mo9786a()
            int r11 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r11 == 0) goto L65
            long r13 = r22.mo9794n()
            long r16 = r16 - r13
            long r13 = (long) r12
            long r13 = r16 + r13
        L65:
            r11 = 8
        L67:
            long r5 = (long) r11
            int r18 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r18 >= 0) goto L6d
            return r8
        L6d:
            int r9 = r9 + r11
            r11 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r15 != r11) goto L80
            int r5 = (int) r13
            int r4 = r4 + r5
            if (r7 == 0) goto L7d
            long r5 = (long) r4
            int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r11 <= 0) goto L7d
            int r4 = (int) r1
        L7d:
            r5 = -1
            goto L1f
        L80:
            r11 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r15 == r11) goto Lf8
            r11 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r15 != r11) goto L8c
            goto Lf8
        L8c:
            r18 = r1
            long r1 = (long) r9
            long r1 = r1 + r13
            long r1 = r1 - r5
            r20 = r9
            long r8 = (long) r4
            int r21 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r21 < 0) goto L9a
            goto Lfc
        L9a:
            long r13 = r13 - r5
            int r1 = (int) r13
            int r9 = r20 + r1
            r2 = 1718909296(0x66747970, float:2.8862439E23)
            if (r15 != r2) goto Leb
            r2 = 0
            if (r1 >= r12) goto La7
            return r2
        La7:
            r3.m13392B(r1)
            byte[] r5 = r3.f25710a
            r0.mo9795o(r5, r2, r1)
            int r1 = r1 / 4
            r2 = 0
        Lb2:
            if (r2 >= r1) goto Le7
            r5 = 1
            if (r2 != r5) goto Lbc
            r6 = 4
            r3.m13397G(r6)
            goto Le4
        Lbc:
            int r6 = r3.m13403f()
            int r8 = r6 >>> 8
            r12 = 3368816(0x336770, float:4.720717E-39)
            if (r8 != r12) goto Lc9
        Lc7:
            r6 = 1
            goto Le0
        Lc9:
            r8 = 1751476579(0x68656963, float:4.333464E24)
            if (r6 != r8) goto Ld1
            if (r24 == 0) goto Ld1
            goto Lc7
        Ld1:
            int[] r8 = p336t4.C6166k.f23858a
            int r12 = r8.length
            r13 = 0
        Ld5:
            if (r13 >= r12) goto Ldf
            r14 = r8[r13]
            if (r14 != r6) goto Ldc
            goto Lc7
        Ldc:
            int r13 = r13 + 1
            goto Ld5
        Ldf:
            r6 = 0
        Le0:
            if (r6 == 0) goto Le4
            r10 = 1
            goto Le7
        Le4:
            int r2 = r2 + 1
            goto Lb2
        Le7:
            r2 = 0
            if (r10 != 0) goto Lf1
            return r2
        Leb:
            r2 = 0
            if (r1 == 0) goto Lf1
            r0.mo9796p(r1)
        Lf1:
            r1 = r18
            r5 = -1
            r8 = 0
            goto L1f
        Lf8:
            r2 = 0
            r5 = 1
            r0 = 1
            goto Lff
        Lfc:
            r2 = 0
            r5 = 1
            r0 = 0
        Lff:
            if (r10 == 0) goto L107
            r1 = r23
            if (r1 != r0) goto L107
            r8 = 1
            goto L108
        L107:
            r8 = 0
        L108:
            return r8
    }
}
