package p370v4;

/* renamed from: v4.h */
/* loaded from: classes.dex */
public final class C6530h implements p370v4.InterfaceC6532j {

    /* renamed from: a */
    public final p371v5.C6571u f25386a;

    /* renamed from: b */
    public final java.lang.String f25387b;

    /* renamed from: c */
    public java.lang.String f25388c;

    /* renamed from: d */
    public p216m4.InterfaceC4381z f25389d;

    /* renamed from: e */
    public int f25390e;

    /* renamed from: f */
    public int f25391f;

    /* renamed from: g */
    public int f25392g;

    /* renamed from: h */
    public long f25393h;

    /* renamed from: i */
    public p088f4.C2003e0 f25394i;

    /* renamed from: j */
    public int f25395j;

    /* renamed from: k */
    public long f25396k;

    public C6530h(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            v5.u r0 = new v5.u
            r1 = 18
            byte[] r1 = new byte[r1]
            r0.<init>(r1)
            r2.f25386a = r0
            r0 = 0
            r2.f25390e = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.f25396k = r0
            r2.f25387b = r3
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: a */
    public void mo13241a() {
            r2 = this;
            r0 = 0
            r2.f25390e = r0
            r2.f25391f = r0
            r2.f25392g = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.f25396k = r0
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: c */
    public void mo13242c(p371v5.C6571u r23) {
            r22 = this;
            r0 = r22
            r1 = r23
            m4.z r2 = r0.f25389d
            p371v5.C6549a.m13292f(r2)
        L9:
            int r2 = r23.m13398a()
            if (r2 <= 0) goto L333
            int r2 = r0.f25390e
            r4 = 8
            r5 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L2d4
            if (r2 == r7) goto L5a
            if (r2 != r5) goto L54
            int r2 = r23.m13398a()
            int r3 = r0.f25395j
            int r4 = r0.f25391f
            int r3 = r3 - r4
            int r2 = java.lang.Math.min(r2, r3)
            m4.z r3 = r0.f25389d
            r3.mo5972d(r1, r2)
            int r3 = r0.f25391f
            int r3 = r3 + r2
            r0.f25391f = r3
            int r13 = r0.f25395j
            if (r3 != r13) goto L9
            long r10 = r0.f25396k
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 == 0) goto L51
            m4.z r9 = r0.f25389d
            r12 = 1
            r14 = 0
            r15 = 0
            r9.mo5971c(r10, r12, r13, r14, r15)
            long r2 = r0.f25396k
            long r4 = r0.f25393h
            long r2 = r2 + r4
            r0.f25396k = r2
        L51:
            r0.f25390e = r8
            goto L9
        L54:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L5a:
            v5.u r2 = r0.f25386a
            byte[] r2 = r2.f25710a
            int r9 = r23.m13398a()
            int r10 = r0.f25391f
            r11 = 18
            int r10 = 18 - r10
            int r9 = java.lang.Math.min(r9, r10)
            int r10 = r0.f25391f
            byte[] r12 = r1.f25710a
            int r13 = r1.f25711b
            java.lang.System.arraycopy(r12, r13, r2, r10, r9)
            int r2 = r1.f25711b
            int r2 = r2 + r9
            r1.f25711b = r2
            int r2 = r0.f25391f
            int r2 = r2 + r9
            r0.f25391f = r2
            if (r2 != r11) goto L83
            r2 = 1
            goto L84
        L83:
            r2 = 0
        L84:
            if (r2 == 0) goto L9
            v5.u r2 = r0.f25386a
            byte[] r2 = r2.f25710a
            f4.e0 r9 = r0.f25394i
            r10 = 14
            r13 = 31
            r14 = -2
            r11 = -1
            if (r9 != 0) goto L206
            java.lang.String r9 = r0.f25388c
            java.lang.String r15 = r0.f25387b
            r6 = r2[r8]
            r3 = 127(0x7f, float:1.78E-43)
            r12 = 0
            if (r6 != r3) goto La8
            m4.b0 r3 = new m4.b0
            r3.<init>(r2, r7, r12)
        La4:
            r4 = 60
            goto L1ae
        La8:
            int r3 = r2.length
            byte[] r3 = java.util.Arrays.copyOf(r2, r3)
            r6 = r3[r8]
            if (r6 == r14) goto Lb8
            r6 = r3[r8]
            if (r6 != r11) goto Lb6
            goto Lb8
        Lb6:
            r6 = 0
            goto Lb9
        Lb8:
            r6 = 1
        Lb9:
            if (r6 == 0) goto Lcd
            r6 = 0
        Lbc:
            int r14 = r3.length
            int r14 = r14 - r7
            if (r6 >= r14) goto Lcd
            r14 = r3[r6]
            int r16 = r6 + 1
            r17 = r3[r16]
            r3[r6] = r17
            r3[r16] = r14
            int r6 = r6 + 2
            goto Lbc
        Lcd:
            m4.b0 r6 = new m4.b0
            r6.<init>(r3, r7, r12)
            r14 = r3[r8]
            if (r14 != r13) goto L1a1
            m4.b0 r14 = new m4.b0
            r14.<init>(r3, r7, r12)
        Ldb:
            int r13 = r14.m9757b()
            r12 = 16
            if (r13 < r12) goto L1a1
            r14.m9775t(r5)
            int r12 = r14.m9766k(r10)
            r12 = r12 & 16383(0x3fff, float:2.2957E-41)
            int r13 = r6.f17872d
            int r13 = 8 - r13
            int r13 = java.lang.Math.min(r13, r10)
            int r5 = r6.f17872d
            int r18 = 8 - r5
            int r18 = r18 - r13
            r19 = 65280(0xff00, float:9.1477E-41)
            int r5 = r19 >> r5
            int r19 = r7 << r18
            int r19 = r19 + (-1)
            r5 = r5 | r19
            java.lang.Object r8 = r6.f17870b
            byte[] r8 = (byte[]) r8
            int r11 = r6.f17871c
            r21 = r8[r11]
            r5 = r5 & r21
            byte r5 = (byte) r5
            r8[r11] = r5
            int r5 = 14 - r13
            int r13 = r12 >>> r5
            r21 = r8[r11]
            int r13 = r13 << r18
            r13 = r13 | r21
            byte r13 = (byte) r13
            r8[r11] = r13
            int r11 = r11 + r7
        L120:
            if (r5 <= r4) goto L133
            java.lang.Object r8 = r6.f17870b
            byte[] r8 = (byte[]) r8
            int r13 = r11 + 1
            int r5 = r5 + (-8)
            int r4 = r12 >>> r5
            byte r4 = (byte) r4
            r8[r11] = r4
            r11 = r13
            r4 = 8
            goto L120
        L133:
            int r4 = 8 - r5
            java.lang.Object r8 = r6.f17870b
            byte[] r8 = (byte[]) r8
            r13 = r8[r11]
            int r21 = r7 << r4
            r20 = -1
            int r21 = r21 + (-1)
            r13 = r13 & r21
            byte r13 = (byte) r13
            r8[r11] = r13
            int r5 = r7 << r5
            int r5 = r5 - r7
            r5 = r5 & r12
            r12 = r8[r11]
            int r4 = r5 << r4
            r4 = r4 | r12
            byte r4 = (byte) r4
            r8[r11] = r4
            r6.m9775t(r10)
            int r4 = r6.f17869a
            switch(r4) {
                case 0: goto L170;
                case 1: goto L15b;
                default: goto L15a;
            }
        L15a:
            goto L185
        L15b:
            int r4 = r6.f17871c
            if (r4 < 0) goto L16b
            int r5 = r6.f17873e
            if (r4 < r5) goto L169
            if (r4 != r5) goto L16b
            int r4 = r6.f17872d
            if (r4 != 0) goto L16b
        L169:
            r4 = 1
            goto L16c
        L16b:
            r4 = 0
        L16c:
            p371v5.C6549a.m13291e(r4)
            goto L199
        L170:
            int r4 = r6.f17872d
            if (r4 < 0) goto L180
            int r5 = r6.f17871c
            if (r4 < r5) goto L17e
            if (r4 != r5) goto L180
            int r4 = r6.f17873e
            if (r4 != 0) goto L180
        L17e:
            r4 = 1
            goto L181
        L180:
            r4 = 0
        L181:
            p371v5.C6549a.m13291e(r4)
            goto L199
        L185:
            int r4 = r6.f17872d
            if (r4 < 0) goto L195
            int r5 = r6.f17871c
            if (r4 < r5) goto L193
            if (r4 != r5) goto L195
            int r4 = r6.f17873e
            if (r4 != 0) goto L195
        L193:
            r4 = 1
            goto L196
        L195:
            r4 = 0
        L196:
            p371v5.C6549a.m13291e(r4)
        L199:
            r4 = 8
            r5 = 2
            r8 = 0
            r11 = -1
            r12 = 0
            goto Ldb
        L1a1:
            int r4 = r3.length
            r6.f17870b = r3
            r3 = 0
            r6.f17871c = r3
            r6.f17872d = r3
            r6.f17873e = r4
            r3 = r6
            goto La4
        L1ae:
            r3.m9775t(r4)
            r4 = 6
            int r5 = r3.m9766k(r4)
            int[] r4 = p121h4.C2481v.f11201a
            r4 = r4[r5]
            r5 = 4
            int r6 = r3.m9766k(r5)
            int[] r5 = p121h4.C2481v.f11202b
            r5 = r5[r6]
            r6 = 5
            int r8 = r3.m9766k(r6)
            int[] r6 = p121h4.C2481v.f11203c
            int r11 = r6.length
            if (r8 < r11) goto L1d0
            r6 = -1
            r8 = 2
            goto L1d6
        L1d0:
            r6 = r6[r8]
            int r6 = r6 * 1000
            r8 = 2
            int r6 = r6 / r8
        L1d6:
            r11 = 10
            r3.m9775t(r11)
            int r3 = r3.m9766k(r8)
            if (r3 <= 0) goto L1e3
            r3 = 1
            goto L1e4
        L1e3:
            r3 = 0
        L1e4:
            int r4 = r4 + r3
            f4.e0$b r3 = new f4.e0$b
            r3.<init>()
            r3.f8917a = r9
            java.lang.String r8 = "audio/vnd.dts"
            r3.f8927k = r8
            r3.f8922f = r6
            r3.f8940x = r4
            r3.f8941y = r5
            r4 = 0
            r3.f8930n = r4
            r3.f8919c = r15
            f4.e0 r3 = r3.m5193a()
            r0.f25394i = r3
            m4.z r4 = r0.f25389d
            r4.mo5973e(r3)
        L206:
            r3 = 0
            r4 = r2[r3]
            r3 = 7
            r5 = -2
            if (r4 == r5) goto L254
            r5 = -1
            if (r4 == r5) goto L239
            r5 = 31
            if (r4 == r5) goto L226
            r4 = 5
            r5 = r2[r4]
            r4 = 3
            r4 = r4 & r5
            int r4 = r4 << 12
            r5 = 6
            r6 = r2[r5]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r8 = 4
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r2[r3]
            goto L264
        L226:
            r4 = 3
            r5 = 6
            r8 = 4
            r6 = r2[r5]
            r4 = r4 & r6
            int r4 = r4 << 12
            r5 = r2[r3]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << r8
            r4 = r4 | r5
            r5 = 8
            r5 = r2[r5]
            goto L24b
        L239:
            r4 = 3
            r8 = 4
            r5 = r2[r3]
            r4 = r4 & r5
            int r4 = r4 << 12
            r5 = 6
            r6 = r2[r5]
            r5 = r6 & 255(0xff, float:3.57E-43)
            int r5 = r5 << r8
            r4 = r4 | r5
            r5 = 9
            r5 = r2[r5]
        L24b:
            r6 = 60
            r5 = r5 & r6
            r6 = 2
            int r5 = r5 >> r6
            r4 = r4 | r5
            int r4 = r4 + r7
            r5 = 1
            goto L26a
        L254:
            r8 = 4
            r4 = r2[r8]
            r5 = 3
            r4 = r4 & r5
            int r4 = r4 << 12
            r5 = r2[r3]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << r8
            r4 = r4 | r5
            r5 = 6
            r6 = r2[r5]
        L264:
            r5 = r6 & 240(0xf0, float:3.36E-43)
            int r5 = r5 >> r8
            r4 = r4 | r5
            int r4 = r4 + r7
            r5 = 0
        L26a:
            if (r5 == 0) goto L26f
            int r4 = r4 * 16
            int r4 = r4 / r10
        L26f:
            r0.f25395j = r4
            r4 = 1000000(0xf4240, double:4.940656E-318)
            r6 = 0
            r8 = r2[r6]
            r6 = -2
            if (r8 == r6) goto L2a2
            r6 = -1
            if (r8 == r6) goto L295
            r6 = 31
            if (r8 == r6) goto L28b
            r6 = 4
            r3 = r2[r6]
            r3 = r3 & r7
            r8 = 6
            int r3 = r3 << r8
            r9 = 5
            r2 = r2[r9]
            goto L2ab
        L28b:
            r6 = 4
            r8 = 6
            r9 = 5
            r9 = r2[r9]
            r3 = r3 & r9
            int r3 = r3 << r6
            r2 = r2[r8]
            goto L29e
        L295:
            r6 = 4
            r8 = r2[r6]
            r8 = r8 & r3
            int r6 = r8 << 4
            r2 = r2[r3]
            r3 = r6
        L29e:
            r6 = 60
            r2 = r2 & r6
            goto L2ad
        L2a2:
            r3 = 5
            r6 = 4
            r8 = 6
            r3 = r2[r3]
            r3 = r3 & r7
            int r3 = r3 << r8
            r2 = r2[r6]
        L2ab:
            r2 = r2 & 252(0xfc, float:3.53E-43)
        L2ad:
            r6 = 2
            int r2 = r2 >> r6
            r2 = r2 | r3
            int r2 = r2 + r7
            int r2 = r2 * 32
            long r2 = (long) r2
            long r2 = r2 * r4
            f4.e0 r4 = r0.f25394i
            int r4 = r4.f8910x0
            long r4 = (long) r4
            long r2 = r2 / r4
            int r3 = (int) r2
            long r2 = (long) r3
            r0.f25393h = r2
            v5.u r2 = r0.f25386a
            r3 = 0
            r2.m13396F(r3)
            m4.z r2 = r0.f25389d
            v5.u r3 = r0.f25386a
            r4 = 18
            r2.mo5972d(r3, r4)
            r2 = 2
            r0.f25390e = r2
            goto L9
        L2d4:
            int r2 = r23.m13398a()
            if (r2 <= 0) goto L32b
            int r2 = r0.f25392g
            r3 = 8
            int r2 = r2 << r3
            r0.f25392g = r2
            int r4 = r23.m13418u()
            r2 = r2 | r4
            r0.f25392g = r2
            r4 = 2147385345(0x7ffe8001, float:NaN)
            if (r2 == r4) goto L2ff
            r4 = -25230976(0xfffffffffe7f0180, float:-8.474023E37)
            if (r2 == r4) goto L2ff
            r4 = 536864768(0x1fffe800, float:1.0838051E-19)
            if (r2 == r4) goto L2ff
            r4 = -14745368(0xffffffffff1f00e8, float:-2.1135196E38)
            if (r2 != r4) goto L2fd
            goto L2ff
        L2fd:
            r4 = 0
            goto L300
        L2ff:
            r4 = 1
        L300:
            if (r4 == 0) goto L2d4
            v5.u r3 = r0.f25386a
            byte[] r3 = r3.f25710a
            int r4 = r2 >> 24
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r5 = 0
            r3[r5] = r4
            int r4 = r2 >> 16
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r3[r7] = r4
            int r4 = r2 >> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r5 = 2
            r3[r5] = r4
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r4 = 3
            r3[r4] = r2
            r2 = 4
            r0.f25391f = r2
            r6 = 0
            r0.f25392g = r6
            r8 = 1
            goto L32d
        L32b:
            r6 = 0
            r8 = 0
        L32d:
            if (r8 == 0) goto L9
            r0.f25390e = r7
            goto L9
        L333:
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: d */
    public void mo13243d(p216m4.InterfaceC4366k r2, p370v4.InterfaceC6525d0.d r3) {
            r1 = this;
            r3.m13253a()
            java.lang.String r0 = r3.m13254b()
            r1.f25388c = r0
            int r3 = r3.m13255c()
            r0 = 1
            m4.z r2 = r2.mo6048l(r3, r0)
            r1.f25389d = r2
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: e */
    public void mo13244e() {
            r0 = this;
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: f */
    public void mo13245f(long r3, int r5) {
            r2 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 == 0) goto Lb
            r2.f25396k = r3
        Lb:
            return
    }
}
