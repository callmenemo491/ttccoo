package p303r3;

/* renamed from: r3.e */
/* loaded from: classes.dex */
public class C5775e extends p303r3.AbstractC5776f {

    /* renamed from: h */
    public p245o3.InterfaceC4890c f22264h;

    /* renamed from: i */
    public android.graphics.Paint f22265i;

    /* renamed from: j */
    public java.lang.ref.WeakReference<android.graphics.Bitmap> f22266j;

    /* renamed from: k */
    public android.graphics.Canvas f22267k;

    /* renamed from: l */
    public android.graphics.Bitmap.Config f22268l;

    /* renamed from: m */
    public android.graphics.Path f22269m;

    /* renamed from: n */
    public android.graphics.Path f22270n;

    /* renamed from: o */
    public float[] f22271o;

    /* renamed from: p */
    public android.graphics.Path f22272p;

    /* renamed from: q */
    public java.util.HashMap<p267p3.InterfaceC5350d, p303r3.C5775e.b> f22273q;

    /* renamed from: r */
    public float[] f22274r;

    /* renamed from: r3.e$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: r3.e$b */
    public class b {

        /* renamed from: a */
        public android.graphics.Path f22275a;

        /* renamed from: b */
        public android.graphics.Bitmap[] f22276b;

        /* renamed from: c */
        public final /* synthetic */ p303r3.C5775e f22277c;

        public b(p303r3.C5775e r1, p303r3.C5775e.a r2) {
                r0 = this;
                r0.f22277c = r1
                r0.<init>()
                android.graphics.Path r1 = new android.graphics.Path
                r1.<init>()
                r0.f22275a = r1
                return
        }
    }

    public C5775e(p245o3.InterfaceC4890c r1, p141i3.C3066a r2, p323s3.C5953g r3) {
            r0 = this;
            r0.<init>(r2, r3)
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            r0.f22268l = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r0.f22269m = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r0.f22270n = r2
            r2 = 4
            float[] r2 = new float[r2]
            r0.f22271o = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r0.f22272p = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r0.f22273q = r2
            r2 = 2
            float[] r2 = new float[r2]
            r0.f22274r = r2
            r0.f22264h = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r2 = 1
            r1.<init>(r2)
            r0.f22265i = r1
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r1.setStyle(r2)
            android.graphics.Paint r1 = r0.f22265i
            r2 = -1
            r1.setColor(r2)
            return
    }

    @Override // p303r3.AbstractC5773c
    /* renamed from: n */
    public void mo12092n(android.graphics.Canvas r31) {
            r30 = this;
            r6 = r30
            r7 = r31
            java.lang.Object r0 = r6.f25150a
            s3.g r0 = (p323s3.C5953g) r0
            float r1 = r0.f22867c
            int r1 = (int) r1
            float r0 = r0.f22868d
            int r0 = (int) r0
            java.lang.ref.WeakReference<android.graphics.Bitmap> r2 = r6.f22266j
            if (r2 != 0) goto L14
            r2 = 0
            goto L1a
        L14:
            java.lang.Object r2 = r2.get()
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
        L1a:
            if (r2 == 0) goto L28
            int r3 = r2.getWidth()
            if (r3 != r1) goto L28
            int r3 = r2.getHeight()
            if (r3 == r0) goto L40
        L28:
            if (r1 <= 0) goto L585
            if (r0 <= 0) goto L585
            android.graphics.Bitmap$Config r2 = r6.f22268l
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r1, r0, r2)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r6.f22266j = r0
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r2)
            r6.f22267k = r0
        L40:
            r9 = r2
            r10 = 0
            r9.eraseColor(r10)
            o3.c r0 = r6.f22264h
            l3.g r0 = r0.getLineData()
            java.util.List<T extends p3.d<? extends l3.f>> r0 = r0.f17278i
            java.util.Iterator r11 = r0.iterator()
        L51:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L57b
            java.lang.Object r0 = r11.next()
            r12 = r0
            p3.e r12 = (p267p3.InterfaceC5351e) r12
            boolean r0 = r12.isVisible()
            if (r0 == 0) goto L56e
            int r0 = r12.mo9255P()
            r1 = 1
            if (r0 >= r1) goto L6d
            goto L56e
        L6d:
            android.graphics.Paint r0 = r6.f22255c
            float r2 = r12.mo9284n()
            r0.setStrokeWidth(r2)
            android.graphics.Paint r0 = r6.f22255c
            android.graphics.DashPathEffect r2 = r12.mo9269I()
            r0.setPathEffect(r2)
            int r0 = r12.mo9272V()
            int r0 = p365v.C6480g.m13148b(r0)
            r2 = 2
            if (r0 == r2) goto L442
            r4 = 3
            if (r0 == r4) goto L374
            int r0 = r12.mo9255P()
            int r5 = r12.mo9272V()
            if (r5 != r2) goto L99
            r5 = 1
            goto L9a
        L99:
            r5 = 0
        L9a:
            if (r5 == 0) goto L9e
            r14 = 4
            goto L9f
        L9e:
            r14 = 2
        L9f:
            o3.c r15 = r6.f22264h
            k3.i$a r8 = r12.mo9228L()
            j3.b r15 = (p161j3.AbstractC3394b) r15
            s3.e r8 = r15.mo7775a(r8)
            i3.a r15 = r6.f22254b
            java.util.Objects.requireNonNull(r15)
            android.graphics.Paint r15 = r6.f22255c
            android.graphics.Paint$Style r13 = android.graphics.Paint.Style.STROKE
            r15.setStyle(r13)
            boolean r13 = r12.mo9278r()
            if (r13 == 0) goto Lc0
            android.graphics.Canvas r13 = r6.f22267k
            goto Lc1
        Lc0:
            r13 = r7
        Lc1:
            r3.b$a r15 = r6.f22249f
            o3.c r4 = r6.f22264h
            r15.m12090a(r4, r12)
            boolean r4 = r12.mo9281a0()
            if (r4 == 0) goto L192
            if (r0 <= 0) goto L192
            r3.b$a r4 = r6.f22249f
            android.graphics.Path r15 = r6.f22272p
            int r10 = r4.f22250a
            int r4 = r4.f22252c
            int r4 = r4 + r10
            r1 = 0
        Lda:
            int r3 = r1 * 128
            int r3 = r3 + r10
            int r2 = r3 + 128
            if (r2 <= r4) goto Le2
            r2 = r4
        Le2:
            r18 = r4
            if (r3 > r2) goto L17c
            v1.b r4 = r12.mo9277h()
            r19 = r10
            o3.c r10 = r6.f22264h
            float r4 = r4.m13182k(r12, r10)
            i3.a r10 = r6.f22254b
            java.util.Objects.requireNonNull(r10)
            int r10 = r12.mo9272V()
            r20 = r11
            r11 = 2
            if (r10 != r11) goto L102
            r10 = 1
            goto L103
        L102:
            r10 = 0
        L103:
            r15.reset()
            l3.f r11 = r12.mo9256X(r3)
            r21 = r9
            float r9 = r11.mo9267b()
            r15.moveTo(r9, r4)
            float r9 = r11.mo9267b()
            float r22 = r11.m9246a()
            r23 = r11
            r17 = 1065353216(0x3f800000, float:1.0)
            float r11 = r22 * r17
            r15.lineTo(r9, r11)
            int r9 = r3 + 1
            r11 = r23
            r22 = 0
        L12a:
            if (r9 > r2) goto L157
            l3.f r22 = r12.mo9256X(r9)
            r23 = r10
            if (r10 == 0) goto L141
            float r10 = r22.mo9267b()
            float r11 = r11.m9246a()
            float r11 = r11 * r17
            r15.lineTo(r10, r11)
        L141:
            float r10 = r22.mo9267b()
            float r11 = r22.m9246a()
            float r11 = r11 * r17
            r15.lineTo(r10, r11)
            int r9 = r9 + 1
            r11 = r22
            r10 = r23
            r17 = 1065353216(0x3f800000, float:1.0)
            goto L12a
        L157:
            if (r22 == 0) goto L160
            float r9 = r22.mo9267b()
            r15.lineTo(r9, r4)
        L160:
            r15.close()
            r8.m12369d(r15)
            android.graphics.drawable.Drawable r4 = r12.mo9280K()
            if (r4 == 0) goto L170
            r6.m12101w(r7, r15, r4)
            goto L182
        L170:
            int r4 = r12.mo9282e()
            int r9 = r12.mo9283f()
            r6.m12100v(r7, r15, r4, r9)
            goto L182
        L17c:
            r21 = r9
            r19 = r10
            r20 = r11
        L182:
            int r1 = r1 + 1
            if (r3 <= r2) goto L187
            goto L196
        L187:
            r4 = r18
            r10 = r19
            r11 = r20
            r9 = r21
            r2 = 2
            goto Lda
        L192:
            r21 = r9
            r20 = r11
        L196:
            java.util.List r1 = r12.mo9242l()
            int r1 = r1.size()
            r2 = 1
            if (r1 <= r2) goto L29d
            float[] r0 = r6.f22271o
            int r0 = r0.length
            int r1 = r14 * 2
            if (r0 > r1) goto L1ae
            int r14 = r14 * 4
            float[] r0 = new float[r14]
            r6.f22271o = r0
        L1ae:
            r3.b$a r0 = r6.f22249f
            int r0 = r0.f22250a
        L1b2:
            r3.b$a r2 = r6.f22249f
            int r3 = r2.f22252c
            int r2 = r2.f22250a
            int r3 = r3 + r2
            if (r0 > r3) goto L36c
            l3.f r2 = r12.mo9256X(r0)
            if (r2 != 0) goto L1c4
        L1c1:
            r4 = 3
            goto L299
        L1c4:
            float[] r3 = r6.f22271o
            float r4 = r2.mo9267b()
            r9 = 0
            r3[r9] = r4
            float[] r3 = r6.f22271o
            float r2 = r2.m9246a()
            r4 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 * r4
            r4 = 1
            r3[r4] = r2
            r3.b$a r2 = r6.f22249f
            int r2 = r2.f22251b
            if (r0 >= r2) goto L236
            int r2 = r0 + 1
            l3.f r2 = r12.mo9256X(r2)
            if (r2 != 0) goto L1ea
            goto L36c
        L1ea:
            if (r5 == 0) goto L21e
            float[] r3 = r6.f22271o
            float r4 = r2.mo9267b()
            r9 = 2
            r3[r9] = r4
            float[] r3 = r6.f22271o
            r4 = 1
            r10 = r3[r4]
            r4 = 3
            r3[r4] = r10
            r10 = r3[r9]
            r9 = 4
            r3[r9] = r10
            r9 = 5
            r10 = r3[r4]
            r3[r9] = r10
            r4 = 6
            float r9 = r2.mo9267b()
            r3[r4] = r9
            float[] r3 = r6.f22271o
            r4 = 7
            float r2 = r2.m9246a()
            r9 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 * r9
            r3[r4] = r2
            r4 = 3
            r10 = 2
            goto L234
        L21e:
            r9 = 1065353216(0x3f800000, float:1.0)
            float[] r3 = r6.f22271o
            float r4 = r2.mo9267b()
            r10 = 2
            r3[r10] = r4
            float[] r3 = r6.f22271o
            float r2 = r2.m9246a()
            float r2 = r2 * r9
            r4 = 3
            r3[r4] = r2
        L234:
            r3 = 0
            goto L244
        L236:
            r4 = 3
            r10 = 2
            float[] r2 = r6.f22271o
            r3 = 0
            r9 = r2[r3]
            r2[r10] = r9
            r9 = 1
            r10 = r2[r9]
            r2[r4] = r10
        L244:
            float[] r2 = r6.f22271o
            r8.m12371f(r2)
            java.lang.Object r2 = r6.f25150a
            s3.g r2 = (p323s3.C5953g) r2
            float[] r4 = r6.f22271o
            r4 = r4[r3]
            boolean r2 = r2.m12385f(r4)
            if (r2 != 0) goto L259
            goto L36c
        L259:
            java.lang.Object r2 = r6.f25150a
            s3.g r2 = (p323s3.C5953g) r2
            float[] r3 = r6.f22271o
            r4 = 2
            r3 = r3[r4]
            boolean r2 = r2.m12384e(r3)
            if (r2 == 0) goto L1c1
            java.lang.Object r2 = r6.f25150a
            s3.g r2 = (p323s3.C5953g) r2
            float[] r3 = r6.f22271o
            r4 = 1
            r3 = r3[r4]
            boolean r2 = r2.m12386g(r3)
            if (r2 != 0) goto L287
            java.lang.Object r2 = r6.f25150a
            s3.g r2 = (p323s3.C5953g) r2
            float[] r3 = r6.f22271o
            r4 = 3
            r3 = r3[r4]
            boolean r2 = r2.m12383d(r3)
            if (r2 != 0) goto L288
            goto L299
        L287:
            r4 = 3
        L288:
            android.graphics.Paint r2 = r6.f22255c
            int r3 = r12.mo9240f0(r0)
            r2.setColor(r3)
            float[] r2 = r6.f22271o
            android.graphics.Paint r3 = r6.f22255c
            r9 = 0
            r13.drawLines(r2, r9, r1, r3)
        L299:
            int r0 = r0 + 1
            goto L1b2
        L29d:
            float[] r1 = r6.f22271o
            int r1 = r1.length
            int r0 = r0 * r14
            int r2 = java.lang.Math.max(r0, r14)
            r3 = 2
            int r2 = r2 * 2
            if (r1 >= r2) goto L2b6
            int r0 = java.lang.Math.max(r0, r14)
            r1 = 4
            int r0 = r0 * 4
            float[] r0 = new float[r0]
            r6.f22271o = r0
        L2b6:
            r3.b$a r0 = r6.f22249f
            int r0 = r0.f22250a
            l3.f r0 = r12.mo9256X(r0)
            if (r0 == 0) goto L36c
            r3.b$a r0 = r6.f22249f
            int r0 = r0.f22250a
            r1 = 0
        L2c5:
            r3.b$a r2 = r6.f22249f
            int r3 = r2.f22252c
            int r2 = r2.f22250a
            int r3 = r3 + r2
            if (r0 > r3) goto L345
            if (r0 != 0) goto L2d2
            r2 = 0
            goto L2d4
        L2d2:
            int r2 = r0 + (-1)
        L2d4:
            l3.f r2 = r12.mo9256X(r2)
            l3.f r3 = r12.mo9256X(r0)
            if (r2 == 0) goto L342
            if (r3 != 0) goto L2e1
            goto L342
        L2e1:
            float[] r4 = r6.f22271o
            int r9 = r1 + 1
            float r10 = r2.mo9267b()
            r4[r1] = r10
            float[] r1 = r6.f22271o
            int r4 = r9 + 1
            float r10 = r2.m9246a()
            r11 = 1065353216(0x3f800000, float:1.0)
            float r10 = r10 * r11
            r1[r9] = r10
            if (r5 == 0) goto L329
            float[] r1 = r6.f22271o
            int r9 = r4 + 1
            float r10 = r3.mo9267b()
            r1[r4] = r10
            float[] r1 = r6.f22271o
            int r4 = r9 + 1
            float r10 = r2.m9246a()
            r11 = 1065353216(0x3f800000, float:1.0)
            float r10 = r10 * r11
            r1[r9] = r10
            float[] r1 = r6.f22271o
            int r9 = r4 + 1
            float r10 = r3.mo9267b()
            r1[r4] = r10
            float[] r1 = r6.f22271o
            int r4 = r9 + 1
            float r2 = r2.m9246a()
            float r2 = r2 * r11
            r1[r9] = r2
        L329:
            float[] r1 = r6.f22271o
            int r2 = r4 + 1
            float r9 = r3.mo9267b()
            r1[r4] = r9
            float[] r1 = r6.f22271o
            int r4 = r2 + 1
            float r3 = r3.m9246a()
            r9 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 * r9
            r1[r2] = r3
            r1 = r4
        L342:
            int r0 = r0 + 1
            goto L2c5
        L345:
            if (r1 <= 0) goto L36c
            float[] r0 = r6.f22271o
            r8.m12371f(r0)
            r3.b$a r0 = r6.f22249f
            int r0 = r0.f22252c
            r1 = 1
            int r0 = r0 + r1
            int r0 = r0 * r14
            int r0 = java.lang.Math.max(r0, r14)
            r1 = 2
            int r0 = r0 * 2
            android.graphics.Paint r1 = r6.f22255c
            int r2 = r12.mo9233R()
            r1.setColor(r2)
            float[] r1 = r6.f22271o
            android.graphics.Paint r2 = r6.f22255c
            r3 = 0
            r13.drawLines(r1, r3, r0, r2)
        L36c:
            android.graphics.Paint r0 = r6.f22255c
            r1 = 0
            r0.setPathEffect(r1)
            goto L43f
        L374:
            r21 = r9
            r20 = r11
            i3.a r0 = r6.f22254b
            java.util.Objects.requireNonNull(r0)
            o3.c r0 = r6.f22264h
            k3.i$a r1 = r12.mo9228L()
            j3.b r0 = (p161j3.AbstractC3394b) r0
            s3.e r8 = r0.mo7775a(r1)
            r3.b$a r0 = r6.f22249f
            o3.c r1 = r6.f22264h
            r0.m12090a(r1, r12)
            android.graphics.Path r0 = r6.f22269m
            r0.reset()
            r3.b$a r0 = r6.f22249f
            int r1 = r0.f22252c
            r2 = 1
            if (r1 < r2) goto L3fc
            int r0 = r0.f22250a
            l3.f r0 = r12.mo9256X(r0)
            android.graphics.Path r1 = r6.f22269m
            float r3 = r0.mo9267b()
            float r4 = r0.m9246a()
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 * r5
            r1.moveTo(r3, r4)
            r3.b$a r1 = r6.f22249f
            int r1 = r1.f22250a
            int r1 = r1 + r2
        L3b8:
            r3.b$a r2 = r6.f22249f
            int r3 = r2.f22252c
            int r2 = r2.f22250a
            int r3 = r3 + r2
            if (r1 > r3) goto L3fc
            l3.f r2 = r12.mo9256X(r1)
            float r3 = r0.mo9267b()
            float r4 = r2.mo9267b()
            float r5 = r0.mo9267b()
            float r4 = r4 - r5
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            float r25 = r4 + r3
            android.graphics.Path r3 = r6.f22269m
            float r0 = r0.m9246a()
            r4 = 1065353216(0x3f800000, float:1.0)
            float r24 = r0 * r4
            float r0 = r2.m9246a()
            float r26 = r0 * r4
            float r27 = r2.mo9267b()
            float r0 = r2.m9246a()
            float r28 = r0 * r4
            r22 = r3
            r23 = r25
            r22.cubicTo(r23, r24, r25, r26, r27, r28)
            int r1 = r1 + 1
            r0 = r2
            goto L3b8
        L3fc:
            boolean r0 = r12.mo9281a0()
            if (r0 == 0) goto L41b
            android.graphics.Path r0 = r6.f22270n
            r0.reset()
            android.graphics.Path r0 = r6.f22270n
            android.graphics.Path r1 = r6.f22269m
            r0.addPath(r1)
            android.graphics.Canvas r1 = r6.f22267k
            android.graphics.Path r3 = r6.f22270n
            r3.b$a r5 = r6.f22249f
            r0 = r30
            r2 = r12
            r4 = r8
            r0.m12099x(r1, r2, r3, r4, r5)
        L41b:
            android.graphics.Paint r0 = r6.f22255c
            int r1 = r12.mo9233R()
            r0.setColor(r1)
            android.graphics.Paint r0 = r6.f22255c
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
            android.graphics.Path r0 = r6.f22269m
            r8.m12369d(r0)
            android.graphics.Canvas r0 = r6.f22267k
            android.graphics.Path r1 = r6.f22269m
            android.graphics.Paint r2 = r6.f22255c
            r0.drawPath(r1, r2)
            android.graphics.Paint r0 = r6.f22255c
            r1 = 0
            r0.setPathEffect(r1)
        L43f:
            r9 = 0
            goto L568
        L442:
            r21 = r9
            r20 = r11
            i3.a r0 = r6.f22254b
            java.util.Objects.requireNonNull(r0)
            o3.c r0 = r6.f22264h
            k3.i$a r1 = r12.mo9228L()
            j3.b r0 = (p161j3.AbstractC3394b) r0
            s3.e r8 = r0.mo7775a(r1)
            r3.b$a r0 = r6.f22249f
            o3.c r1 = r6.f22264h
            r0.m12090a(r1, r12)
            float r0 = r12.mo9268F()
            android.graphics.Path r1 = r6.f22269m
            r1.reset()
            r3.b$a r1 = r6.f22249f
            int r2 = r1.f22252c
            r3 = 1
            if (r2 < r3) goto L524
            int r1 = r1.f22250a
            int r1 = r1 + r3
            int r2 = r1 + (-2)
            r9 = 0
            int r2 = java.lang.Math.max(r2, r9)
            l3.f r2 = r12.mo9256X(r2)
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r1, r9)
            l3.f r1 = r12.mo9256X(r1)
            if (r1 != 0) goto L48a
            r1 = 0
            goto L568
        L48a:
            android.graphics.Path r3 = r6.f22269m
            float r4 = r1.mo9267b()
            float r5 = r1.m9246a()
            r10 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 * r10
            r3.moveTo(r4, r5)
            r3.b$a r3 = r6.f22249f
            int r3 = r3.f22250a
            r4 = 1
            int r3 = r3 + r4
            r4 = -1
            r4 = r3
            r5 = -1
            r3 = r1
        L4a5:
            r3.b$a r10 = r6.f22249f
            int r11 = r10.f22252c
            int r10 = r10.f22250a
            int r11 = r11 + r10
            if (r4 > r11) goto L525
            if (r5 != r4) goto L4b1
            goto L4b5
        L4b1:
            l3.f r1 = r12.mo9256X(r4)
        L4b5:
            int r5 = r4 + 1
            int r10 = r12.mo9255P()
            if (r5 >= r10) goto L4be
            r4 = r5
        L4be:
            l3.f r10 = r12.mo9256X(r4)
            float r11 = r1.mo9267b()
            float r13 = r2.mo9267b()
            float r11 = r11 - r13
            float r11 = r11 * r0
            float r13 = r1.m9246a()
            float r2 = r2.m9246a()
            float r13 = r13 - r2
            float r13 = r13 * r0
            float r2 = r10.mo9267b()
            float r14 = r3.mo9267b()
            float r2 = r2 - r14
            float r2 = r2 * r0
            float r14 = r10.m9246a()
            float r15 = r3.m9246a()
            float r14 = r14 - r15
            float r14 = r14 * r0
            android.graphics.Path r15 = r6.f22269m
            float r16 = r3.mo9267b()
            float r23 = r16 + r11
            float r11 = r3.m9246a()
            float r11 = r11 + r13
            r13 = 1065353216(0x3f800000, float:1.0)
            float r24 = r11 * r13
            float r11 = r1.mo9267b()
            float r25 = r11 - r2
            float r2 = r1.m9246a()
            float r2 = r2 - r14
            float r26 = r2 * r13
            float r27 = r1.mo9267b()
            float r2 = r1.m9246a()
            float r28 = r2 * r13
            r22 = r15
            r22.cubicTo(r23, r24, r25, r26, r27, r28)
            r2 = r3
            r3 = r1
            r1 = r10
            r29 = r5
            r5 = r4
            r4 = r29
            goto L4a5
        L524:
            r9 = 0
        L525:
            boolean r0 = r12.mo9281a0()
            if (r0 == 0) goto L544
            android.graphics.Path r0 = r6.f22270n
            r0.reset()
            android.graphics.Path r0 = r6.f22270n
            android.graphics.Path r1 = r6.f22269m
            r0.addPath(r1)
            android.graphics.Canvas r1 = r6.f22267k
            android.graphics.Path r3 = r6.f22270n
            r3.b$a r5 = r6.f22249f
            r0 = r30
            r2 = r12
            r4 = r8
            r0.m12099x(r1, r2, r3, r4, r5)
        L544:
            android.graphics.Paint r0 = r6.f22255c
            int r1 = r12.mo9233R()
            r0.setColor(r1)
            android.graphics.Paint r0 = r6.f22255c
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
            android.graphics.Path r0 = r6.f22269m
            r8.m12369d(r0)
            android.graphics.Canvas r0 = r6.f22267k
            android.graphics.Path r1 = r6.f22269m
            android.graphics.Paint r2 = r6.f22255c
            r0.drawPath(r1, r2)
            android.graphics.Paint r0 = r6.f22255c
            r1 = 0
            r0.setPathEffect(r1)
        L568:
            android.graphics.Paint r0 = r6.f22255c
            r0.setPathEffect(r1)
            goto L574
        L56e:
            r21 = r9
            r20 = r11
            r1 = 0
            r9 = 0
        L574:
            r11 = r20
            r9 = r21
            r10 = 0
            goto L51
        L57b:
            r21 = r9
            android.graphics.Paint r0 = r6.f22255c
            r1 = 0
            r2 = r21
            r7.drawBitmap(r2, r1, r1, r0)
        L585:
            return
    }

    @Override // p303r3.AbstractC5773c
    /* renamed from: o */
    public void mo12093o(android.graphics.Canvas r20) {
            r19 = this;
            r0 = r19
            android.graphics.Paint r1 = r0.f22255c
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r1.setStyle(r2)
            i3.a r1 = r0.f22254b
            java.util.Objects.requireNonNull(r1)
            float[] r1 = r0.f22274r
            r2 = 0
            r3 = 0
            r1[r2] = r3
            r4 = 1
            r1[r4] = r3
            o3.c r1 = r0.f22264h
            l3.g r1 = r1.getLineData()
            java.util.List<T extends p3.d<? extends l3.f>> r1 = r1.f17278i
            r5 = 0
        L20:
            int r6 = r1.size()
            if (r5 >= r6) goto L1ad
            java.lang.Object r6 = r1.get(r5)
            p3.e r6 = (p267p3.InterfaceC5351e) r6
            boolean r7 = r6.isVisible()
            if (r7 == 0) goto L1a2
            boolean r7 = r6.mo9271S()
            if (r7 == 0) goto L1a2
            int r7 = r6.mo9255P()
            if (r7 != 0) goto L40
            goto L1a2
        L40:
            android.graphics.Paint r7 = r0.f22265i
            int r8 = r6.mo9279w()
            r7.setColor(r8)
            o3.c r7 = r0.f22264h
            k3.i$a r8 = r6.mo9228L()
            j3.b r7 = (p161j3.AbstractC3394b) r7
            s3.e r7 = r7.mo7775a(r8)
            r3.b$a r8 = r0.f22249f
            o3.c r9 = r0.f22264h
            r8.m12090a(r9, r6)
            float r8 = r6.mo9274Z()
            float r9 = r6.mo9273Y()
            boolean r10 = r6.mo9276e0()
            if (r10 == 0) goto L74
            int r10 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r10 >= 0) goto L74
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 <= 0) goto L74
            r9 = 1
            goto L75
        L74:
            r9 = 0
        L75:
            if (r9 == 0) goto L82
            int r10 = r6.mo9279w()
            r11 = 1122867(0x112233, float:1.573472E-39)
            if (r10 != r11) goto L82
            r10 = 1
            goto L83
        L82:
            r10 = 0
        L83:
            java.util.HashMap<p3.d, r3.e$b> r11 = r0.f22273q
            boolean r11 = r11.containsKey(r6)
            r12 = 0
            if (r11 == 0) goto L95
            java.util.HashMap<p3.d, r3.e$b> r11 = r0.f22273q
            java.lang.Object r11 = r11.get(r6)
            r3.e$b r11 = (p303r3.C5775e.b) r11
            goto L9f
        L95:
            r3.e$b r11 = new r3.e$b
            r11.<init>(r0, r12)
            java.util.HashMap<p3.d, r3.e$b> r13 = r0.f22273q
            r13.put(r6, r11)
        L9f:
            java.util.Objects.requireNonNull(r11)
            int r13 = r6.mo9275c()
            android.graphics.Bitmap[] r14 = r11.f22276b
            if (r14 != 0) goto Laf
            android.graphics.Bitmap[] r13 = new android.graphics.Bitmap[r13]
            r11.f22276b = r13
            goto Lb6
        Laf:
            int r14 = r14.length
            if (r14 == r13) goto Lb8
            android.graphics.Bitmap[] r13 = new android.graphics.Bitmap[r13]
            r11.f22276b = r13
        Lb6:
            r13 = 1
            goto Lb9
        Lb8:
            r13 = 0
        Lb9:
            if (r13 == 0) goto L125
            int r13 = r6.mo9275c()
            float r14 = r6.mo9274Z()
            float r15 = r6.mo9273Y()
            r3 = 0
        Lc8:
            if (r3 >= r13) goto L125
            android.graphics.Bitmap$Config r12 = android.graphics.Bitmap.Config.ARGB_4444
            r16 = r5
            double r4 = (double) r14
            r17 = 4611911198408756429(0x4000cccccccccccd, double:2.1)
            double r4 = r4 * r17
            int r4 = (int) r4
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r4, r12)
            android.graphics.Canvas r5 = new android.graphics.Canvas
            r5.<init>(r4)
            android.graphics.Bitmap[] r12 = r11.f22276b
            r12[r3] = r4
            r3.e r4 = r11.f22277c
            android.graphics.Paint r4 = r4.f22255c
            int r12 = r6.mo9270J(r3)
            r4.setColor(r12)
            if (r10 == 0) goto L10e
            android.graphics.Path r4 = r11.f22275a
            r4.reset()
            android.graphics.Path r4 = r11.f22275a
            android.graphics.Path$Direction r12 = android.graphics.Path.Direction.CW
            r4.addCircle(r14, r14, r14, r12)
            android.graphics.Path r4 = r11.f22275a
            android.graphics.Path$Direction r12 = android.graphics.Path.Direction.CCW
            r4.addCircle(r14, r14, r15, r12)
            android.graphics.Path r4 = r11.f22275a
            r3.e r12 = r11.f22277c
            android.graphics.Paint r12 = r12.f22255c
            r5.drawPath(r4, r12)
            goto L11e
        L10e:
            r3.e r4 = r11.f22277c
            android.graphics.Paint r4 = r4.f22255c
            r5.drawCircle(r14, r14, r14, r4)
            if (r9 == 0) goto L11e
            r3.e r4 = r11.f22277c
            android.graphics.Paint r4 = r4.f22265i
            r5.drawCircle(r14, r14, r15, r4)
        L11e:
            int r3 = r3 + 1
            r5 = r16
            r4 = 1
            r12 = 0
            goto Lc8
        L125:
            r16 = r5
            r3.b$a r3 = r0.f22249f
            int r4 = r3.f22252c
            int r3 = r3.f22250a
            int r4 = r4 + r3
        L12e:
            if (r3 > r4) goto L19e
            l3.f r5 = r6.mo9256X(r3)
            if (r5 != 0) goto L137
            goto L19e
        L137:
            float[] r9 = r0.f22274r
            float r10 = r5.mo9267b()
            r9[r2] = r10
            float[] r9 = r0.f22274r
            float r5 = r5.m9246a()
            r10 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 * r10
            r10 = 1
            r9[r10] = r5
            float[] r5 = r0.f22274r
            r7.m12371f(r5)
            java.lang.Object r5 = r0.f25150a
            s3.g r5 = (p323s3.C5953g) r5
            float[] r9 = r0.f22274r
            r9 = r9[r2]
            boolean r5 = r5.m12385f(r9)
            if (r5 != 0) goto L160
            goto L19e
        L160:
            java.lang.Object r5 = r0.f25150a
            s3.g r5 = (p323s3.C5953g) r5
            float[] r9 = r0.f22274r
            r9 = r9[r2]
            boolean r5 = r5.m12384e(r9)
            if (r5 == 0) goto L197
            java.lang.Object r5 = r0.f25150a
            s3.g r5 = (p323s3.C5953g) r5
            float[] r9 = r0.f22274r
            r10 = 1
            r9 = r9[r10]
            boolean r5 = r5.m12388i(r9)
            if (r5 != 0) goto L17e
            goto L197
        L17e:
            android.graphics.Bitmap[] r5 = r11.f22276b
            int r9 = r5.length
            int r9 = r3 % r9
            r5 = r5[r9]
            if (r5 == 0) goto L197
            float[] r9 = r0.f22274r
            r10 = r9[r2]
            float r10 = r10 - r8
            r12 = 1
            r9 = r9[r12]
            float r9 = r9 - r8
            r13 = r20
            r14 = 0
            r13.drawBitmap(r5, r10, r9, r14)
            goto L19b
        L197:
            r13 = r20
            r12 = 1
            r14 = 0
        L19b:
            int r3 = r3 + 1
            goto L12e
        L19e:
            r13 = r20
        L1a0:
            r12 = 1
            goto L1a7
        L1a2:
            r13 = r20
            r16 = r5
            goto L1a0
        L1a7:
            int r5 = r16 + 1
            r3 = 0
            r4 = 1
            goto L20
        L1ad:
            return
    }

    @Override // p303r3.AbstractC5773c
    /* renamed from: p */
    public void mo12094p(android.graphics.Canvas r10, p230n3.C4684b[] r11) {
            r9 = this;
            o3.c r0 = r9.f22264h
            l3.g r0 = r0.getLineData()
            int r1 = r11.length
            r2 = 0
        L8:
            if (r2 >= r1) goto Ld0
            r3 = r11[r2]
            int r4 = r3.f18656f
            p3.d r4 = r0.m9248b(r4)
            p3.e r4 = (p267p3.InterfaceC5351e) r4
            if (r4 == 0) goto Lcc
            boolean r5 = r4.mo9234T()
            if (r5 != 0) goto L1e
            goto Lcc
        L1e:
            float r5 = r3.f18651a
            float r6 = r3.f18652b
            l3.f r5 = r4.mo9261p(r5, r6)
            boolean r6 = r9.m12088t(r5, r4)
            if (r6 != 0) goto L2e
            goto Lcc
        L2e:
            o3.c r6 = r9.f22264h
            k3.i$a r7 = r4.mo9228L()
            j3.b r6 = (p161j3.AbstractC3394b) r6
            s3.e r6 = r6.mo7775a(r7)
            float r7 = r5.mo9267b()
            float r5 = r5.m9246a()
            i3.a r8 = r9.f22254b
            java.util.Objects.requireNonNull(r8)
            r8 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 * r8
            s3.b r5 = r6.m12366a(r7, r5)
            double r6 = r5.f22835b
            float r6 = (float) r6
            double r7 = r5.f22836c
            float r5 = (float) r7
            r3.f18659i = r6
            r3.f18660j = r5
            android.graphics.Paint r3 = r9.f22256d
            int r7 = r4.mo9285H()
            r3.setColor(r7)
            android.graphics.Paint r3 = r9.f22256d
            float r7 = r4.mo9289z()
            r3.setStrokeWidth(r7)
            android.graphics.Paint r3 = r9.f22256d
            android.graphics.DashPathEffect r7 = r4.mo9288k()
            r3.setPathEffect(r7)
            boolean r3 = r4.mo9286U()
            if (r3 == 0) goto La0
            android.graphics.Path r3 = r9.f22278g
            r3.reset()
            android.graphics.Path r3 = r9.f22278g
            java.lang.Object r7 = r9.f25150a
            s3.g r7 = (p323s3.C5953g) r7
            android.graphics.RectF r7 = r7.f22866b
            float r7 = r7.top
            r3.moveTo(r6, r7)
            android.graphics.Path r3 = r9.f22278g
            java.lang.Object r7 = r9.f25150a
            s3.g r7 = (p323s3.C5953g) r7
            android.graphics.RectF r7 = r7.f22866b
            float r7 = r7.bottom
            r3.lineTo(r6, r7)
            android.graphics.Path r3 = r9.f22278g
            android.graphics.Paint r6 = r9.f22256d
            r10.drawPath(r3, r6)
        La0:
            boolean r3 = r4.mo9287b0()
            if (r3 == 0) goto Lcc
            android.graphics.Path r3 = r9.f22278g
            r3.reset()
            android.graphics.Path r3 = r9.f22278g
            java.lang.Object r4 = r9.f25150a
            s3.g r4 = (p323s3.C5953g) r4
            android.graphics.RectF r4 = r4.f22866b
            float r4 = r4.left
            r3.moveTo(r4, r5)
            android.graphics.Path r3 = r9.f22278g
            java.lang.Object r4 = r9.f25150a
            s3.g r4 = (p323s3.C5953g) r4
            android.graphics.RectF r4 = r4.f22866b
            float r4 = r4.right
            r3.lineTo(r4, r5)
            android.graphics.Path r3 = r9.f22278g
            android.graphics.Paint r4 = r9.f22256d
            r10.drawPath(r3, r4)
        Lcc:
            int r2 = r2 + 1
            goto L8
        Ld0:
            return
    }

    @Override // p303r3.AbstractC5773c
    /* renamed from: q */
    public void mo12095q(android.graphics.Canvas r17) {
            r16 = this;
            r0 = r16
            o3.c r1 = r0.f22264h
            boolean r1 = r0.m12097s(r1)
            if (r1 == 0) goto L14c
            o3.c r1 = r0.f22264h
            l3.g r1 = r1.getLineData()
            java.util.List<T extends p3.d<? extends l3.f>> r1 = r1.f17278i
            r2 = 0
            r3 = 0
        L14:
            int r4 = r1.size()
            if (r3 >= r4) goto L14c
            java.lang.Object r4 = r1.get(r3)
            p3.e r4 = (p267p3.InterfaceC5351e) r4
            boolean r5 = r0.m12089u(r4)
            if (r5 == 0) goto L146
            int r5 = r4.mo9255P()
            r6 = 1
            if (r5 >= r6) goto L2f
            goto L146
        L2f:
            r0.m12091m(r4)
            o3.c r5 = r0.f22264h
            k3.i$a r7 = r4.mo9228L()
            j3.b r5 = (p161j3.AbstractC3394b) r5
            s3.e r5 = r5.mo7775a(r7)
            float r7 = r4.mo9274Z()
            r8 = 1071644672(0x3fe00000, float:1.75)
            float r7 = r7 * r8
            int r7 = (int) r7
            boolean r8 = r4.mo9271S()
            if (r8 != 0) goto L4f
            int r7 = r7 / 2
        L4f:
            r3.b$a r8 = r0.f22249f
            o3.c r9 = r0.f22264h
            r8.m12090a(r9, r4)
            i3.a r8 = r0.f22254b
            java.util.Objects.requireNonNull(r8)
            i3.a r8 = r0.f22254b
            java.util.Objects.requireNonNull(r8)
            r3.b$a r8 = r0.f22249f
            int r9 = r8.f22250a
            int r8 = r8.f22251b
            int r8 = r8 - r9
            float r8 = (float) r8
            r10 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 * r10
            int r8 = (int) r8
            int r8 = r8 + r6
            int r8 = r8 * 2
            float[] r6 = r5.f22851d
            int r6 = r6.length
            if (r6 == r8) goto L79
            float[] r6 = new float[r8]
            r5.f22851d = r6
        L79:
            float[] r6 = r5.f22851d
            r11 = 0
        L7c:
            if (r11 >= r8) goto La2
            int r12 = r11 / 2
            int r12 = r12 + r9
            l3.f r12 = r4.mo9256X(r12)
            if (r12 == 0) goto L98
            float r13 = r12.mo9267b()
            r6[r11] = r13
            int r13 = r11 + 1
            float r12 = r12.m9246a()
            float r12 = r12 * r10
            r6[r13] = r12
            goto L9f
        L98:
            r12 = 0
            r6[r11] = r12
            int r13 = r11 + 1
            r6[r13] = r12
        L9f:
            int r11 = r11 + 2
            goto L7c
        La2:
            android.graphics.Matrix r8 = r5.f22854g
            android.graphics.Matrix r9 = r5.f22848a
            r8.set(r9)
            android.graphics.Matrix r8 = r5.f22854g
            s3.g r9 = r5.f22850c
            android.graphics.Matrix r9 = r9.f22865a
            r8.postConcat(r9)
            android.graphics.Matrix r8 = r5.f22854g
            android.graphics.Matrix r9 = r5.f22849b
            r8.postConcat(r9)
            android.graphics.Matrix r5 = r5.f22854g
            r5.mapPoints(r6)
            m3.c r5 = r4.mo9231O()
            s3.c r8 = r4.mo9232Q()
            s3.c r8 = p323s3.C5949c.m12360c(r8)
            float r9 = r8.f22838b
            float r9 = p323s3.AbstractC5952f.m12377d(r9)
            r8.f22838b = r9
            float r9 = r8.f22839c
            float r9 = p323s3.AbstractC5952f.m12377d(r9)
            r8.f22839c = r9
            r9 = 0
        Ldb:
            int r10 = r6.length
            if (r9 >= r10) goto L13e
            r10 = r6[r9]
            int r11 = r9 + 1
            r11 = r6[r11]
            java.lang.Object r12 = r0.f25150a
            s3.g r12 = (p323s3.C5953g) r12
            boolean r12 = r12.m12385f(r10)
            if (r12 != 0) goto Lef
            goto L13e
        Lef:
            java.lang.Object r12 = r0.f25150a
            s3.g r12 = (p323s3.C5953g) r12
            boolean r12 = r12.m12384e(r10)
            if (r12 == 0) goto L139
            java.lang.Object r12 = r0.f25150a
            s3.g r12 = (p323s3.C5953g) r12
            boolean r12 = r12.m12388i(r11)
            if (r12 != 0) goto L104
            goto L139
        L104:
            int r12 = r9 / 2
            r3.b$a r13 = r0.f22249f
            int r13 = r13.f22250a
            int r13 = r13 + r12
            l3.f r13 = r4.mo9256X(r13)
            boolean r14 = r4.mo9227D()
            if (r14 == 0) goto L133
            java.util.Objects.requireNonNull(r5)
            float r14 = r13.m9246a()
            java.lang.String r14 = r5.mo9734a(r14)
            float r15 = (float) r7
            float r11 = r11 - r15
            int r12 = r4.mo9241i(r12)
            android.graphics.Paint r15 = r0.f22257e
            r15.setColor(r12)
            android.graphics.Paint r12 = r0.f22257e
            r15 = r17
            r15.drawText(r14, r10, r11, r12)
            goto L135
        L133:
            r15 = r17
        L135:
            java.util.Objects.requireNonNull(r13)
            goto L13b
        L139:
            r15 = r17
        L13b:
            int r9 = r9 + 2
            goto Ldb
        L13e:
            r15 = r17
            s3.d<s3.c> r4 = p323s3.C5949c.f22837d
            r4.m12363c(r8)
            goto L148
        L146:
            r15 = r17
        L148:
            int r3 = r3 + 1
            goto L14
        L14c:
            return
    }

    @Override // p303r3.AbstractC5773c
    /* renamed from: r */
    public void mo12096r() {
            r0 = this;
            return
    }

    /* renamed from: x */
    public void m12099x(android.graphics.Canvas r4, p267p3.InterfaceC5351e r5, android.graphics.Path r6, p323s3.C5951e r7, p303r3.AbstractC5772b.a r8) {
            r3 = this;
            v1.b r0 = r5.mo9277h()
            o3.c r1 = r3.f22264h
            float r0 = r0.m13182k(r5, r1)
            int r1 = r8.f22250a
            int r2 = r8.f22252c
            int r1 = r1 + r2
            l3.f r1 = r5.mo9256X(r1)
            float r1 = r1.mo9267b()
            r6.lineTo(r1, r0)
            int r8 = r8.f22250a
            l3.f r8 = r5.mo9256X(r8)
            float r8 = r8.mo9267b()
            r6.lineTo(r8, r0)
            r6.close()
            r7.m12369d(r6)
            android.graphics.drawable.Drawable r7 = r5.mo9280K()
            if (r7 == 0) goto L37
            r3.m12101w(r4, r6, r7)
            goto L42
        L37:
            int r7 = r5.mo9282e()
            int r5 = r5.mo9283f()
            r3.m12100v(r4, r6, r7, r5)
        L42:
            return
    }
}
