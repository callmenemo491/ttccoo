package p407x5;

/* renamed from: x5.f */
/* loaded from: classes.dex */
public final class C6951f {
    /* renamed from: a */
    public static java.util.ArrayList<p407x5.C6950e.a> m14118a(p371v5.C6571u r28) {
            r0 = r28
            int r1 = r28.m13418u()
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            r1 = 7
            r0.m13397G(r1)
            int r3 = r28.m13403f()
            r4 = 1684433976(0x64666c38, float:1.7002196E22)
            r5 = 1
            if (r3 != r4) goto L34
            v5.u r3 = new v5.u
            r3.<init>()
            java.util.zip.Inflater r4 = new java.util.zip.Inflater
            r4.<init>(r5)
            boolean r0 = p371v5.C6552b0.m13330w(r0, r3, r4)     // Catch: java.lang.Throwable -> L2e
            r4.end()
            if (r0 != 0) goto L2c
            return r2
        L2c:
            r0 = r3
            goto L3a
        L2e:
            r0 = move-exception
            r1 = r0
            r4.end()
            throw r1
        L34:
            r4 = 1918990112(0x72617720, float:4.465801E30)
            if (r3 == r4) goto L3a
            return r2
        L3a:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r0.f25711b
            int r6 = r0.f25712c
        L43:
            if (r4 >= r6) goto L1b7
            int r7 = r0.m13403f()
            int r7 = r7 + r4
            if (r7 <= r4) goto L1b5
            if (r7 <= r6) goto L50
            goto L1b5
        L50:
            int r4 = r0.m13403f()
            r8 = 1835365224(0x6d657368, float:4.438224E27)
            if (r4 != r8) goto L1a6
            int r4 = r0.m13403f()
            r8 = 10000(0x2710, float:1.4013E-41)
            if (r4 <= r8) goto L62
            goto L7c
        L62:
            float[] r8 = new float[r4]
            r10 = 0
        L65:
            if (r10 >= r4) goto L74
            int r11 = r0.m13403f()
            float r11 = java.lang.Float.intBitsToFloat(r11)
            r8[r10] = r11
            int r10 = r10 + 1
            goto L65
        L74:
            int r10 = r0.m13403f()
            r11 = 32000(0x7d00, float:4.4842E-41)
            if (r10 <= r11) goto L85
        L7c:
            r20 = r0
            r0 = r2
            r22 = r6
            r19 = 1
            goto L19d
        L85:
            r11 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r13 = java.lang.Math.log(r11)
            r15 = r10
            double r9 = (double) r4
            double r9 = r9 * r11
            double r9 = java.lang.Math.log(r9)
            double r9 = r9 / r13
            double r9 = java.lang.Math.ceil(r9)
            int r9 = (int) r9
            m4.b0 r10 = new m4.b0
            byte[] r11 = r0.f25710a
            r10.<init>(r11, r5, r2)
            int r11 = r0.f25711b
            r12 = 8
            int r11 = r11 * 8
            r10.m9772q(r11)
            int r11 = r15 * 5
            float[] r11 = new float[r11]
            r2 = 5
            int[] r12 = new int[r2]
            r1 = 0
            r18 = 0
        Lb3:
            if (r1 >= r15) goto Le1
            r5 = 0
        Lb6:
            if (r5 >= r2) goto Ldc
            r20 = r12[r5]
            int r21 = r10.m9766k(r9)
            int r22 = r21 >> 1
            r19 = 1
            r2 = r21 & 1
            int r2 = -r2
            r2 = r2 ^ r22
            int r2 = r20 + r2
            if (r2 >= r4) goto L10a
            if (r2 >= 0) goto Lce
            goto L10a
        Lce:
            int r20 = r18 + 1
            r21 = r8[r2]
            r11[r18] = r21
            r12[r5] = r2
            int r5 = r5 + 1
            r18 = r20
            r2 = 5
            goto Lb6
        Ldc:
            int r1 = r1 + 1
            r2 = 5
            r5 = 1
            goto Lb3
        Le1:
            int r1 = r10.m9763h()
            r2 = 7
            int r1 = r1 + r2
            r1 = r1 & (-8)
            r10.m9772q(r1)
            r1 = 32
            int r4 = r10.m9766k(r1)
            x5.e$b[] r5 = new p407x5.C6950e.b[r4]
            r8 = 0
        Lf5:
            if (r8 >= r4) goto L192
            r9 = 8
            int r12 = r10.m9766k(r9)
            int r2 = r10.m9766k(r9)
            int r9 = r10.m9766k(r1)
            r1 = 128000(0x1f400, float:1.79366E-40)
            if (r9 <= r1) goto L111
        L10a:
            r20 = r0
            r22 = r6
        L10e:
            r19 = 1
            goto L17a
        L111:
            r20 = r0
            double r0 = (double) r15
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r0 * r16
            double r0 = java.lang.Math.log(r0)
            double r0 = r0 / r13
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            int r1 = r9 * 3
            float[] r1 = new float[r1]
            r21 = r4
            int r4 = r9 * 2
            float[] r4 = new float[r4]
            r22 = r6
            r6 = 0
            r23 = 0
        L131:
            if (r6 >= r9) goto L17c
            int r24 = r10.m9766k(r0)
            int r25 = r24 >> 1
            r26 = r0
            r19 = 1
            r0 = r24 & 1
            int r0 = -r0
            r0 = r0 ^ r25
            int r0 = r23 + r0
            if (r0 < 0) goto L10e
            if (r0 < r15) goto L149
            goto L10e
        L149:
            int r23 = r6 * 3
            int r24 = r0 * 5
            r25 = r11[r24]
            r1[r23] = r25
            int r25 = r23 + 1
            int r27 = r24 + 1
            r27 = r11[r27]
            r1[r25] = r27
            int r23 = r23 + 2
            int r25 = r24 + 2
            r25 = r11[r25]
            r1[r23] = r25
            int r23 = r6 * 2
            int r25 = r24 + 3
            r25 = r11[r25]
            r4[r23] = r25
            r19 = 1
            int r23 = r23 + 1
            int r24 = r24 + 4
            r24 = r11[r24]
            r4[r23] = r24
            int r6 = r6 + 1
            r23 = r0
            r0 = r26
            goto L131
        L17a:
            r0 = 0
            goto L19d
        L17c:
            r19 = 1
            x5.e$b r0 = new x5.e$b
            r0.<init>(r12, r1, r4, r2)
            r5[r8] = r0
            int r8 = r8 + 1
            r0 = r20
            r4 = r21
            r6 = r22
            r1 = 32
            r2 = 7
            goto Lf5
        L192:
            r20 = r0
            r22 = r6
            r19 = 1
            x5.e$a r0 = new x5.e$a
            r0.<init>(r5)
        L19d:
            if (r0 != 0) goto L1a0
            goto L1b5
        L1a0:
            r3.add(r0)
            r0 = r20
            goto L1aa
        L1a6:
            r22 = r6
            r19 = 1
        L1aa:
            r0.m13396F(r7)
            r4 = r7
            r6 = r22
            r1 = 7
            r2 = 0
            r5 = 1
            goto L43
        L1b5:
            r2 = 0
            goto L1b8
        L1b7:
            r2 = r3
        L1b8:
            return r2
    }
}
