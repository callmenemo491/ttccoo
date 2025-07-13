package p421xj;

/* renamed from: xj.b */
/* loaded from: classes.dex */
public class C7086b implements p421xj.InterfaceC7088d {

    /* renamed from: a */
    public final byte[] f27426a;

    /* renamed from: b */
    public final byte[] f27427b;

    public C7086b() {
            r4 = this;
            r4.<init>()
            r0 = 64
            byte[] r0 = new byte[r0]
            r0 = {x0030: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47} // fill-array
            r4.f27426a = r0
            r0 = 128(0x80, float:1.8E-43)
            byte[] r0 = new byte[r0]
            r4.f27427b = r0
            r0 = 0
            r1 = 0
        L14:
            byte[] r2 = r4.f27427b
            int r3 = r2.length
            if (r1 >= r3) goto L1f
            r3 = -1
            r2[r1] = r3
            int r1 = r1 + 1
            goto L14
        L1f:
            byte[] r1 = r4.f27426a
            int r2 = r1.length
            if (r0 >= r2) goto L2e
            byte[] r2 = r4.f27427b
            r1 = r1[r0]
            byte r3 = (byte) r0
            r2[r1] = r3
            int r0 = r0 + 1
            goto L1f
        L2e:
            return
    }

    /* renamed from: a */
    public int m14190a(java.lang.String r11, java.io.OutputStream r12) {
            r10 = this;
            int r0 = r11.length()
        L4:
            if (r0 <= 0) goto L15
            int r1 = r0 + (-1)
            char r2 = r11.charAt(r1)
            boolean r2 = r10.m14192c(r2)
            if (r2 != 0) goto L13
            goto L15
        L13:
            r0 = r1
            goto L4
        L15:
            r1 = 0
            if (r0 != 0) goto L19
            return r1
        L19:
            r2 = r0
            r3 = 0
        L1b:
            r4 = 4
            if (r2 <= 0) goto L2f
            if (r3 == r4) goto L2f
            int r2 = r2 + (-1)
            char r4 = r11.charAt(r2)
            boolean r4 = r10.m14192c(r4)
            if (r4 != 0) goto L1b
            int r3 = r3 + 1
            goto L1b
        L2f:
            int r3 = r10.m14193d(r11, r1, r2)
        L33:
            if (r3 >= r2) goto L94
            byte[] r5 = r10.f27427b
            int r6 = r3 + 1
            char r3 = r11.charAt(r3)
            r3 = r5[r3]
            int r5 = r10.m14193d(r11, r6, r2)
            byte[] r6 = r10.f27427b
            int r7 = r5 + 1
            char r5 = r11.charAt(r5)
            r5 = r6[r5]
            int r6 = r10.m14193d(r11, r7, r2)
            byte[] r7 = r10.f27427b
            int r8 = r6 + 1
            char r6 = r11.charAt(r6)
            r6 = r7[r6]
            int r7 = r10.m14193d(r11, r8, r2)
            byte[] r8 = r10.f27427b
            int r9 = r7 + 1
            char r7 = r11.charAt(r7)
            r7 = r8[r7]
            r8 = r3 | r5
            r8 = r8 | r6
            r8 = r8 | r7
            if (r8 < 0) goto L8c
            int r3 = r3 << 2
            int r8 = r5 >> 4
            r3 = r3 | r8
            r12.write(r3)
            int r3 = r5 << 4
            int r5 = r6 >> 2
            r3 = r3 | r5
            r12.write(r3)
            int r3 = r6 << 6
            r3 = r3 | r7
            r12.write(r3)
            int r1 = r1 + 3
            int r3 = r10.m14193d(r11, r9, r2)
            goto L33
        L8c:
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r12 = "invalid characters encountered in base64 data"
            r11.<init>(r12)
            throw r11
        L94:
            int r2 = r10.m14193d(r11, r3, r0)
            int r3 = r2 + 1
            int r3 = r10.m14193d(r11, r3, r0)
            int r5 = r3 + 1
            int r5 = r10.m14193d(r11, r5, r0)
            int r6 = r5 + 1
            int r0 = r10.m14193d(r11, r6, r0)
            char r2 = r11.charAt(r2)
            char r3 = r11.charAt(r3)
            char r5 = r11.charAt(r5)
            char r11 = r11.charAt(r0)
            r0 = 61
            java.lang.String r6 = "invalid characters encountered at end of base64 data"
            r7 = 2
            if (r5 != r0) goto Le1
            if (r11 != r0) goto Ldb
            byte[] r11 = r10.f27427b
            r0 = r11[r2]
            r11 = r11[r3]
            r2 = r0 | r11
            if (r2 < 0) goto Ld5
            int r0 = r0 << r7
            int r11 = r11 >> r4
            r11 = r11 | r0
            r12.write(r11)
            r7 = 1
            goto L12c
        Ld5:
            java.io.IOException r11 = new java.io.IOException
            r11.<init>(r6)
            throw r11
        Ldb:
            java.io.IOException r11 = new java.io.IOException
            r11.<init>(r6)
            throw r11
        Le1:
            if (r11 != r0) goto L105
            byte[] r11 = r10.f27427b
            r0 = r11[r2]
            r2 = r11[r3]
            r11 = r11[r5]
            r3 = r0 | r2
            r3 = r3 | r11
            if (r3 < 0) goto Lff
            int r0 = r0 << r7
            int r3 = r2 >> 4
            r0 = r0 | r3
            r12.write(r0)
            int r0 = r2 << 4
            int r11 = r11 >> r7
            r11 = r11 | r0
            r12.write(r11)
            goto L12c
        Lff:
            java.io.IOException r11 = new java.io.IOException
            r11.<init>(r6)
            throw r11
        L105:
            byte[] r0 = r10.f27427b
            r2 = r0[r2]
            r3 = r0[r3]
            r5 = r0[r5]
            r11 = r0[r11]
            r0 = r2 | r3
            r0 = r0 | r5
            r0 = r0 | r11
            if (r0 < 0) goto L12e
            int r0 = r2 << 2
            int r2 = r3 >> 4
            r0 = r0 | r2
            r12.write(r0)
            int r0 = r3 << 4
            int r2 = r5 >> 2
            r0 = r0 | r2
            r12.write(r0)
            int r0 = r5 << 6
            r11 = r11 | r0
            r12.write(r11)
            r7 = 3
        L12c:
            int r1 = r1 + r7
            return r1
        L12e:
            java.io.IOException r11 = new java.io.IOException
            r11.<init>(r6)
            throw r11
    }

    /* renamed from: b */
    public int m14191b(byte[] r10, int r11, int r12, java.io.OutputStream r13) {
            r9 = this;
            int r0 = r12 % 3
            int r12 = r12 - r0
            r1 = r11
        L4:
            int r2 = r11 + r12
            r3 = 4
            r4 = 2
            if (r1 >= r2) goto L4c
            r2 = r10[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r5 = r1 + 1
            r5 = r10[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r6 = r1 + 2
            r6 = r10[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte[] r7 = r9.f27426a
            int r8 = r2 >>> 2
            r8 = r8 & 63
            r7 = r7[r8]
            r13.write(r7)
            byte[] r7 = r9.f27426a
            int r2 = r2 << r3
            int r3 = r5 >>> 4
            r2 = r2 | r3
            r2 = r2 & 63
            r2 = r7[r2]
            r13.write(r2)
            byte[] r2 = r9.f27426a
            int r3 = r5 << 2
            int r4 = r6 >>> 6
            r3 = r3 | r4
            r3 = r3 & 63
            r2 = r2[r3]
            r13.write(r2)
            byte[] r2 = r9.f27426a
            r3 = r6 & 63
            r2 = r2[r3]
            r13.write(r2)
            int r1 = r1 + 3
            goto L4
        L4c:
            r11 = 61
            r1 = 1
            if (r0 == r1) goto L81
            if (r0 == r4) goto L54
            goto La0
        L54:
            r5 = r10[r2]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r2 = r2 + r1
            r10 = r10[r2]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r1 = r5 >>> 2
            r1 = r1 & 63
            int r2 = r5 << 4
            int r5 = r10 >>> 4
            r2 = r2 | r5
            r2 = r2 & 63
            int r10 = r10 << r4
            r10 = r10 & 63
            byte[] r4 = r9.f27426a
            r1 = r4[r1]
            r13.write(r1)
            byte[] r1 = r9.f27426a
            r1 = r1[r2]
            r13.write(r1)
            byte[] r1 = r9.f27426a
            r10 = r1[r10]
            r13.write(r10)
            goto L9d
        L81:
            r10 = r10[r2]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r1 = r10 >>> 2
            r1 = r1 & 63
            int r10 = r10 << r3
            r10 = r10 & 63
            byte[] r2 = r9.f27426a
            r1 = r2[r1]
            r13.write(r1)
            byte[] r1 = r9.f27426a
            r10 = r1[r10]
            r13.write(r10)
            r13.write(r11)
        L9d:
            r13.write(r11)
        La0:
            int r12 = r12 / 3
            int r12 = r12 * 4
            if (r0 != 0) goto La7
            r3 = 0
        La7:
            int r12 = r12 + r3
            return r12
    }

    /* renamed from: c */
    public final boolean m14192c(char r2) {
            r1 = this;
            r0 = 10
            if (r2 == r0) goto L13
            r0 = 13
            if (r2 == r0) goto L13
            r0 = 9
            if (r2 == r0) goto L13
            r0 = 32
            if (r2 != r0) goto L11
            goto L13
        L11:
            r2 = 0
            goto L14
        L13:
            r2 = 1
        L14:
            return r2
    }

    /* renamed from: d */
    public final int m14193d(java.lang.String r2, int r3, int r4) {
            r1 = this;
        L0:
            if (r3 >= r4) goto Lf
            char r0 = r2.charAt(r3)
            boolean r0 = r1.m14192c(r0)
            if (r0 == 0) goto Lf
            int r3 = r3 + 1
            goto L0
        Lf:
            return r3
    }
}
