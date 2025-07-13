package p183k5;

/* renamed from: k5.a */
/* loaded from: classes.dex */
public final class C3694a extends p143i5.AbstractC3081e {

    /* renamed from: n */
    public final p183k5.C3695b f16335n;

    public C3694a(java.util.List<byte[]> r4) {
            r3 = this;
            java.lang.String r0 = "DvbDecoder"
            r3.<init>(r0)
            r0 = 0
            java.lang.Object r4 = r4.get(r0)
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            r1 = 0
            int r1 = r1 + 1
            r0 = r4[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            int r2 = r1 + 1
            r1 = r4[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            int r1 = r2 + 1
            r2 = r4[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r4 = r4[r1]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r4 = r4 | r2
            k5.b r1 = new k5.b
            r1.<init>(r0, r4)
            r3.f16335n = r1
            return
    }

    @Override // p143i5.AbstractC3081e
    /* renamed from: j */
    public p143i5.InterfaceC3082f mo7541j(byte[] r48, int r49, boolean r50) {
            r47 = this;
            r0 = r47
            r1 = 0
            if (r50 == 0) goto L26
            k5.b r2 = r0.f16335n
            k5.b$h r2 = r2.f16344f
            android.util.SparseArray<k5.b$f> r3 = r2.f16379c
            r3.clear()
            android.util.SparseArray<k5.b$a> r3 = r2.f16380d
            r3.clear()
            android.util.SparseArray<k5.b$c> r3 = r2.f16381e
            r3.clear()
            android.util.SparseArray<k5.b$a> r3 = r2.f16382f
            r3.clear()
            android.util.SparseArray<k5.b$c> r3 = r2.f16383g
            r3.clear()
            r2.f16384h = r1
            r2.f16385i = r1
        L26:
            j5.e r2 = new j5.e
            k5.b r3 = r0.f16335n
            java.util.Objects.requireNonNull(r3)
            m4.b0 r4 = new m4.b0
            r5 = r48
            r6 = r49
            r4.<init>(r5, r6)
        L36:
            int r5 = r4.m9757b()
            r6 = 48
            r7 = 3
            r8 = 2
            r9 = 1
            if (r5 < r6) goto L224
            r5 = 8
            int r6 = r4.m9766k(r5)
            r11 = 15
            if (r6 != r11) goto L224
            k5.b$h r6 = r3.f16344f
            int r11 = r4.m9766k(r5)
            r12 = 16
            int r13 = r4.m9766k(r12)
            int r14 = r4.m9766k(r12)
            int r15 = r4.m9761f()
            int r15 = r15 + r14
            int r1 = r14 * 8
            int r10 = r4.m9757b()
            if (r1 <= r10) goto L78
            java.lang.String r1 = "DvbParser"
            java.lang.String r5 = "Data field length exceeds limit"
            android.util.Log.w(r1, r5)
            int r1 = r4.m9757b()
            r4.m9775t(r1)
        L76:
            r1 = 0
            goto L36
        L78:
            r1 = 4
            switch(r11) {
                case 16: goto L1bb;
                case 17: goto Lf4;
                case 18: goto Ldb;
                case 19: goto Lc2;
                case 20: goto L7e;
                default: goto L7c;
            }
        L7c:
            goto L21a
        L7e:
            int r5 = r6.f16377a
            if (r13 != r5) goto L21a
            r4.m9775t(r1)
            boolean r1 = r4.m9765j()
            r4.m9775t(r7)
            int r17 = r4.m9766k(r12)
            int r18 = r4.m9766k(r12)
            if (r1 == 0) goto Laf
            int r10 = r4.m9766k(r12)
            int r1 = r4.m9766k(r12)
            int r5 = r4.m9766k(r12)
            int r7 = r4.m9766k(r12)
            r20 = r1
            r21 = r5
            r22 = r7
            r19 = r10
            goto Lb7
        Laf:
            r20 = r17
            r22 = r18
            r19 = 0
            r21 = 0
        Lb7:
            k5.b$b r1 = new k5.b$b
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r6.f16384h = r1
            goto L21a
        Lc2:
            int r1 = r6.f16377a
            if (r13 != r1) goto Lcd
            k5.b$c r1 = p183k5.C3695b.m8155g(r4)
            android.util.SparseArray<k5.b$c> r5 = r6.f16381e
            goto Ld7
        Lcd:
            int r1 = r6.f16378b
            if (r13 != r1) goto L21a
            k5.b$c r1 = p183k5.C3695b.m8155g(r4)
            android.util.SparseArray<k5.b$c> r5 = r6.f16383g
        Ld7:
            int r6 = r1.f16356a
            goto L1b7
        Ldb:
            int r1 = r6.f16377a
            if (r13 != r1) goto Le6
            k5.b$a r1 = p183k5.C3695b.m8154f(r4, r14)
            android.util.SparseArray<k5.b$a> r5 = r6.f16380d
            goto Lf0
        Le6:
            int r1 = r6.f16378b
            if (r13 != r1) goto L21a
            k5.b$a r1 = p183k5.C3695b.m8154f(r4, r14)
            android.util.SparseArray<k5.b$a> r5 = r6.f16382f
        Lf0:
            int r6 = r1.f16346a
            goto L1b7
        Lf4:
            k5.b$d r10 = r6.f16385i
            int r11 = r6.f16377a
            if (r13 != r11) goto L21a
            if (r10 == 0) goto L21a
            int r11 = r4.m9766k(r5)
            r4.m9775t(r1)
            boolean r18 = r4.m9765j()
            r4.m9775t(r7)
            int r19 = r4.m9766k(r12)
            int r20 = r4.m9766k(r12)
            int r21 = r4.m9766k(r7)
            int r22 = r4.m9766k(r7)
            r4.m9775t(r8)
            int r23 = r4.m9766k(r5)
            int r24 = r4.m9766k(r5)
            int r25 = r4.m9766k(r1)
            int r26 = r4.m9766k(r8)
            r4.m9775t(r8)
            int r14 = r14 + (-10)
            android.util.SparseArray r7 = new android.util.SparseArray
            r7.<init>()
        L137:
            if (r14 <= 0) goto L17f
            int r13 = r4.m9766k(r12)
            int r12 = r4.m9766k(r8)
            int r29 = r4.m9766k(r8)
            r5 = 12
            int r30 = r4.m9766k(r5)
            r4.m9775t(r1)
            int r31 = r4.m9766k(r5)
            int r14 = r14 + (-6)
            if (r12 == r9) goto L15e
            if (r12 != r8) goto L159
            goto L15e
        L159:
            r32 = 0
            r33 = 0
            goto L16e
        L15e:
            r5 = 8
            int r16 = r4.m9766k(r5)
            int r17 = r4.m9766k(r5)
            int r14 = r14 + (-2)
            r32 = r16
            r33 = r17
        L16e:
            k5.b$g r5 = new k5.b$g
            r27 = r5
            r28 = r12
            r27.<init>(r28, r29, r30, r31, r32, r33)
            r7.put(r13, r5)
            r5 = 8
            r12 = 16
            goto L137
        L17f:
            k5.b$f r1 = new k5.b$f
            r16 = r1
            r17 = r11
            r27 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            int r5 = r10.f16361b
            if (r5 != 0) goto L1b3
            android.util.SparseArray<k5.b$f> r5 = r6.f16379c
            java.lang.Object r5 = r5.get(r11)
            k5.b$f r5 = (p183k5.C3695b.f) r5
            if (r5 == 0) goto L1b3
            android.util.SparseArray<k5.b$g> r5 = r5.f16374j
            r10 = 0
        L19b:
            int r7 = r5.size()
            if (r10 >= r7) goto L1b3
            android.util.SparseArray<k5.b$g> r7 = r1.f16374j
            int r8 = r5.keyAt(r10)
            java.lang.Object r9 = r5.valueAt(r10)
            k5.b$g r9 = (p183k5.C3695b.g) r9
            r7.put(r8, r9)
            int r10 = r10 + 1
            goto L19b
        L1b3:
            android.util.SparseArray<k5.b$f> r5 = r6.f16379c
            int r6 = r1.f16365a
        L1b7:
            r5.put(r6, r1)
            goto L21a
        L1bb:
            int r5 = r6.f16377a
            if (r13 != r5) goto L21a
            k5.b$d r5 = r6.f16385i
            r7 = 8
            int r9 = r4.m9766k(r7)
            int r1 = r4.m9766k(r1)
            int r10 = r4.m9766k(r8)
            r4.m9775t(r8)
            int r14 = r14 + (-2)
            android.util.SparseArray r8 = new android.util.SparseArray
            r8.<init>()
        L1d9:
            if (r14 <= 0) goto L1f9
            int r11 = r4.m9766k(r7)
            r4.m9775t(r7)
            r12 = 16
            int r13 = r4.m9766k(r12)
            int r7 = r4.m9766k(r12)
            int r14 = r14 + (-6)
            k5.b$e r12 = new k5.b$e
            r12.<init>(r13, r7)
            r8.put(r11, r12)
            r7 = 8
            goto L1d9
        L1f9:
            k5.b$d r7 = new k5.b$d
            r7.<init>(r9, r1, r10, r8)
            if (r10 == 0) goto L212
            r6.f16385i = r7
            android.util.SparseArray<k5.b$f> r1 = r6.f16379c
            r1.clear()
            android.util.SparseArray<k5.b$a> r1 = r6.f16380d
            r1.clear()
            android.util.SparseArray<k5.b$c> r1 = r6.f16381e
            r1.clear()
            goto L21a
        L212:
            if (r5 == 0) goto L21a
            int r5 = r5.f16360a
            if (r5 == r1) goto L21a
            r6.f16385i = r7
        L21a:
            int r1 = r4.m9761f()
            int r15 = r15 - r1
            r4.m9776u(r15)
            goto L76
        L224:
            k5.b$h r1 = r3.f16344f
            k5.b$d r4 = r1.f16385i
            if (r4 != 0) goto L232
            java.util.List r1 = java.util.Collections.emptyList()
            r26 = r2
            goto L406
        L232:
            k5.b$b r1 = r1.f16384h
            if (r1 == 0) goto L237
            goto L239
        L237:
            k5.b$b r1 = r3.f16342d
        L239:
            android.graphics.Bitmap r5 = r3.f16345g
            if (r5 == 0) goto L251
            int r6 = r1.f16350a
            int r6 = r6 + r9
            int r5 = r5.getWidth()
            if (r6 != r5) goto L251
            int r5 = r1.f16351b
            int r5 = r5 + r9
            android.graphics.Bitmap r6 = r3.f16345g
            int r6 = r6.getHeight()
            if (r5 == r6) goto L264
        L251:
            int r5 = r1.f16350a
            int r5 = r5 + r9
            int r6 = r1.f16351b
            int r6 = r6 + r9
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r5, r6, r10)
            r3.f16345g = r5
            android.graphics.Canvas r6 = r3.f16341c
            r6.setBitmap(r5)
        L264:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            android.util.SparseArray<k5.b$e> r4 = r4.f16362c
            r6 = 0
        L26c:
            int r10 = r4.size()
            if (r6 >= r10) goto L400
            android.graphics.Canvas r10 = r3.f16341c
            r10.save()
            java.lang.Object r10 = r4.valueAt(r6)
            k5.b$e r10 = (p183k5.C3695b.e) r10
            int r11 = r4.keyAt(r6)
            k5.b$h r12 = r3.f16344f
            android.util.SparseArray<k5.b$f> r12 = r12.f16379c
            java.lang.Object r11 = r12.get(r11)
            k5.b$f r11 = (p183k5.C3695b.f) r11
            int r12 = r10.f16363a
            int r13 = r1.f16352c
            int r12 = r12 + r13
            int r10 = r10.f16364b
            int r13 = r1.f16354e
            int r10 = r10 + r13
            int r13 = r11.f16367c
            int r13 = r13 + r12
            int r14 = r1.f16353d
            int r13 = java.lang.Math.min(r13, r14)
            int r14 = r11.f16368d
            int r14 = r14 + r10
            int r15 = r1.f16355f
            int r14 = java.lang.Math.min(r14, r15)
            android.graphics.Canvas r15 = r3.f16341c
            r15.clipRect(r12, r10, r13, r14)
            k5.b$h r13 = r3.f16344f
            android.util.SparseArray<k5.b$a> r13 = r13.f16380d
            int r14 = r11.f16370f
            java.lang.Object r13 = r13.get(r14)
            k5.b$a r13 = (p183k5.C3695b.a) r13
            if (r13 != 0) goto L2ca
            k5.b$h r13 = r3.f16344f
            android.util.SparseArray<k5.b$a> r13 = r13.f16382f
            int r14 = r11.f16370f
            java.lang.Object r13 = r13.get(r14)
            k5.b$a r13 = (p183k5.C3695b.a) r13
            if (r13 != 0) goto L2ca
            k5.b$a r13 = r3.f16343e
        L2ca:
            android.util.SparseArray<k5.b$g> r14 = r11.f16374j
            r15 = 0
        L2cd:
            int r9 = r14.size()
            if (r15 >= r9) goto L355
            int r9 = r14.keyAt(r15)
            java.lang.Object r16 = r14.valueAt(r15)
            r8 = r16
            k5.b$g r8 = (p183k5.C3695b.g) r8
            k5.b$h r7 = r3.f16344f
            android.util.SparseArray<k5.b$c> r7 = r7.f16381e
            java.lang.Object r7 = r7.get(r9)
            k5.b$c r7 = (p183k5.C3695b.c) r7
            if (r7 != 0) goto L2f5
            k5.b$h r7 = r3.f16344f
            android.util.SparseArray<k5.b$c> r7 = r7.f16383g
            java.lang.Object r7 = r7.get(r9)
            k5.b$c r7 = (p183k5.C3695b.c) r7
        L2f5:
            if (r7 == 0) goto L33d
            boolean r9 = r7.f16357b
            if (r9 == 0) goto L2fd
            r9 = 0
            goto L2ff
        L2fd:
            android.graphics.Paint r9 = r3.f16339a
        L2ff:
            int r0 = r11.f16369e
            r24 = r4
            int r4 = r8.f16375a
            int r4 = r4 + r12
            int r8 = r8.f16376b
            int r8 = r8 + r10
            r25 = r14
            android.graphics.Canvas r14 = r3.f16341c
            r26 = r2
            r2 = 3
            if (r0 != r2) goto L315
            int[] r2 = r13.f16349d
            goto L31d
        L315:
            r2 = 2
            if (r0 != r2) goto L31b
            int[] r2 = r13.f16348c
            goto L31d
        L31b:
            int[] r2 = r13.f16347b
        L31d:
            r27 = r6
            byte[] r6 = r7.f16358c
            r17 = r6
            r18 = r2
            r19 = r0
            r20 = r4
            r21 = r8
            r22 = r9
            r23 = r14
            p183k5.C3695b.m8153e(r17, r18, r19, r20, r21, r22, r23)
            byte[] r6 = r7.f16359d
            r7 = 1
            int r21 = r8 + 1
            r17 = r6
            p183k5.C3695b.m8153e(r17, r18, r19, r20, r21, r22, r23)
            goto L345
        L33d:
            r26 = r2
            r24 = r4
            r27 = r6
            r25 = r14
        L345:
            int r15 = r15 + 1
            r0 = r47
            r4 = r24
            r14 = r25
            r2 = r26
            r6 = r27
            r7 = 3
            r8 = 2
            goto L2cd
        L355:
            r26 = r2
            r24 = r4
            r27 = r6
            boolean r0 = r11.f16366b
            if (r0 == 0) goto L39f
            int r0 = r11.f16369e
            r2 = 3
            if (r0 != r2) goto L36c
            int[] r0 = r13.f16349d
            int r4 = r11.f16371g
            r0 = r0[r4]
            r4 = 2
            goto L37c
        L36c:
            r4 = 2
            if (r0 != r4) goto L376
            int[] r0 = r13.f16348c
            int r6 = r11.f16372h
            r0 = r0[r6]
            goto L37c
        L376:
            int[] r0 = r13.f16347b
            int r6 = r11.f16373i
            r0 = r0[r6]
        L37c:
            android.graphics.Paint r6 = r3.f16340b
            r6.setColor(r0)
            android.graphics.Canvas r0 = r3.f16341c
            float r6 = (float) r12
            float r7 = (float) r10
            int r8 = r11.f16367c
            int r8 = r8 + r12
            float r8 = (float) r8
            int r9 = r11.f16368d
            int r9 = r9 + r10
            float r9 = (float) r9
            android.graphics.Paint r13 = r3.f16340b
            r16 = r0
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r13
            r16.drawRect(r17, r18, r19, r20, r21)
            goto L3a1
        L39f:
            r2 = 3
            r4 = 2
        L3a1:
            r45 = 0
            r30 = 0
            r29 = r30
            r31 = r30
            r39 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r38 = -2147483648(0xffffffff80000000, float:-0.0)
            r44 = r38
            r42 = 0
            r43 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.graphics.Bitmap r0 = r3.f16345g
            int r6 = r11.f16367c
            int r7 = r11.f16368d
            android.graphics.Bitmap r32 = android.graphics.Bitmap.createBitmap(r0, r12, r10, r6, r7)
            float r0 = (float) r12
            int r6 = r1.f16350a
            float r6 = (float) r6
            float r36 = r0 / r6
            r37 = 0
            float r0 = (float) r10
            int r7 = r1.f16351b
            float r7 = (float) r7
            float r33 = r0 / r7
            r34 = 0
            r35 = 0
            int r0 = r11.f16367c
            float r0 = (float) r0
            float r40 = r0 / r6
            int r0 = r11.f16368d
            float r0 = (float) r0
            float r41 = r0 / r7
            i5.a r0 = new i5.a
            r28 = r0
            r46 = 0
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            r5.add(r0)
            android.graphics.Canvas r0 = r3.f16341c
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.CLEAR
            r7 = 0
            r0.drawColor(r7, r6)
            android.graphics.Canvas r0 = r3.f16341c
            r0.restore()
            int r6 = r27 + 1
            r0 = r47
            r4 = r24
            r2 = r26
            r7 = 3
            r8 = 2
            r9 = 1
            goto L26c
        L400:
            r26 = r2
            java.util.List r1 = java.util.Collections.unmodifiableList(r5)
        L406:
            r0 = r26
            r2 = 1
            r0.<init>(r1, r2)
            return r0
    }
}
