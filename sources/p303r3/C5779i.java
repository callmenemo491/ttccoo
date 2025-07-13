package p303r3;

/* renamed from: r3.i */
/* loaded from: classes.dex */
public class C5779i extends p303r3.AbstractC5771a {

    /* renamed from: h */
    public p181k3.C3685i f22287h;

    /* renamed from: i */
    public android.graphics.Paint f22288i;

    /* renamed from: j */
    public android.graphics.Path f22289j;

    /* renamed from: k */
    public android.graphics.RectF f22290k;

    /* renamed from: l */
    public float[] f22291l;

    /* renamed from: m */
    public android.graphics.Path f22292m;

    /* renamed from: n */
    public android.graphics.RectF f22293n;

    /* renamed from: o */
    public android.graphics.Path f22294o;

    /* renamed from: p */
    public float[] f22295p;

    /* renamed from: q */
    public android.graphics.RectF f22296q;

    public C5779i(p323s3.C5953g r1, p181k3.C3685i r2, p323s3.C5951e r3) {
            r0 = this;
            r0.<init>(r1, r3, r2)
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r0.f22289j = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f22290k = r1
            r1 = 2
            float[] r3 = new float[r1]
            r0.f22291l = r3
            android.graphics.Path r3 = new android.graphics.Path
            r3.<init>()
            r0.f22292m = r3
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r0.f22293n = r3
            android.graphics.Path r3 = new android.graphics.Path
            r3.<init>()
            r0.f22294o = r3
            float[] r1 = new float[r1]
            r0.f22295p = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f22296q = r1
            r0.f22287h = r2
            java.lang.Object r1 = r0.f25150a
            s3.g r1 = (p323s3.C5953g) r1
            if (r1 == 0) goto L6c
            android.graphics.Paint r1 = r0.f22246e
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.setColor(r2)
            android.graphics.Paint r1 = r0.f22246e
            r2 = 1092616192(0x41200000, float:10.0)
            float r2 = p323s3.AbstractC5952f.m12377d(r2)
            r1.setTextSize(r2)
            android.graphics.Paint r1 = new android.graphics.Paint
            r2 = 1
            r1.<init>(r2)
            r0.f22288i = r1
            r2 = -7829368(0xffffffffff888888, float:NaN)
            r1.setColor(r2)
            android.graphics.Paint r1 = r0.f22288i
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.setStrokeWidth(r2)
            android.graphics.Paint r1 = r0.f22288i
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r2)
        L6c:
            return
    }

    /* renamed from: o */
    public void m12111o(android.graphics.Canvas r6, float r7, float[] r8, float r9) {
            r5 = this;
            k3.i r0 = r5.f22287h
            boolean r1 = r0.f16311z
            r1 = r1 ^ 1
            boolean r2 = r0.f16303A
            int r0 = r0.f16257l
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            int r0 = r0 + (-1)
        Lf:
            if (r1 >= r0) goto L26
            k3.i r2 = r5.f22287h
            java.lang.String r2 = r2.m8136b(r1)
            int r3 = r1 * 2
            int r3 = r3 + 1
            r3 = r8[r3]
            float r3 = r3 + r9
            android.graphics.Paint r4 = r5.f22246e
            r6.drawText(r2, r7, r3, r4)
            int r1 = r1 + 1
            goto Lf
        L26:
            return
    }

    /* renamed from: p */
    public android.graphics.RectF m12112p() {
            r3 = this;
            android.graphics.RectF r0 = r3.f22290k
            java.lang.Object r1 = r3.f25150a
            s3.g r1 = (p323s3.C5953g) r1
            android.graphics.RectF r1 = r1.f22866b
            r0.set(r1)
            android.graphics.RectF r0 = r3.f22290k
            r1 = 0
            k3.a r2 = r3.f22243b
            float r2 = r2.f16253h
            float r2 = -r2
            r0.inset(r1, r2)
            android.graphics.RectF r0 = r3.f22290k
            return r0
    }

    /* renamed from: q */
    public float[] m12113q() {
            r5 = this;
            float[] r0 = r5.f22291l
            int r0 = r0.length
            k3.i r1 = r5.f22287h
            int r1 = r1.f16257l
            int r2 = r1 * 2
            if (r0 == r2) goto L11
            int r1 = r1 * 2
            float[] r0 = new float[r1]
            r5.f22291l = r0
        L11:
            float[] r0 = r5.f22291l
            r1 = 0
        L14:
            int r2 = r0.length
            if (r1 >= r2) goto L26
            int r2 = r1 + 1
            k3.i r3 = r5.f22287h
            float[] r3 = r3.f16256k
            int r4 = r1 / 2
            r3 = r3[r4]
            r0[r2] = r3
            int r1 = r1 + 2
            goto L14
        L26:
            s3.e r1 = r5.f22244c
            r1.m12371f(r0)
            return r0
    }

    /* renamed from: r */
    public android.graphics.Path m12114r(android.graphics.Path r3, int r4, float[] r5) {
            r2 = this;
            java.lang.Object r0 = r2.f25150a
            s3.g r0 = (p323s3.C5953g) r0
            android.graphics.RectF r0 = r0.f22866b
            float r0 = r0.left
            int r4 = r4 + 1
            r1 = r5[r4]
            r3.moveTo(r0, r1)
            java.lang.Object r0 = r2.f25150a
            s3.g r0 = (p323s3.C5953g) r0
            android.graphics.RectF r0 = r0.f22866b
            float r0 = r0.right
            r4 = r5[r4]
            r3.lineTo(r0, r4)
            return r3
    }

    /* renamed from: s */
    public void m12115s(android.graphics.Canvas r8) {
            r7 = this;
            k3.i r0 = r7.f22287h
            boolean r1 = r0.f16271a
            if (r1 == 0) goto L93
            boolean r0 = r0.f16263r
            if (r0 != 0) goto Lc
            goto L93
        Lc:
            float[] r0 = r7.m12113q()
            android.graphics.Paint r1 = r7.f22246e
            k3.i r2 = r7.f22287h
            java.util.Objects.requireNonNull(r2)
            r2 = 0
            r1.setTypeface(r2)
            android.graphics.Paint r1 = r7.f22246e
            k3.i r2 = r7.f22287h
            float r2 = r2.f16274d
            r1.setTextSize(r2)
            android.graphics.Paint r1 = r7.f22246e
            k3.i r2 = r7.f22287h
            int r2 = r2.f16275e
            r1.setColor(r2)
            k3.i r1 = r7.f22287h
            float r1 = r1.f16272b
            android.graphics.Paint r2 = r7.f22246e
            java.lang.String r3 = "A"
            int r2 = p323s3.AbstractC5952f.m12374a(r2, r3)
            float r2 = (float) r2
            r3 = 1075838976(0x40200000, float:2.5)
            float r2 = r2 / r3
            k3.i r3 = r7.f22287h
            float r4 = r3.f16273c
            float r2 = r2 + r4
            k3.i$a r4 = r3.f16309G
            int r3 = r3.f16308F
            k3.i$a r5 = p181k3.C3685i.a.f16312Y
            r6 = 1
            if (r4 != r5) goto L6d
            if (r3 != r6) goto L5d
            android.graphics.Paint r3 = r7.f22246e
            android.graphics.Paint$Align r4 = android.graphics.Paint.Align.RIGHT
            r3.setTextAlign(r4)
            java.lang.Object r3 = r7.f25150a
            s3.g r3 = (p323s3.C5953g) r3
            android.graphics.RectF r3 = r3.f22866b
            float r3 = r3.left
            goto L8f
        L5d:
            android.graphics.Paint r3 = r7.f22246e
            android.graphics.Paint$Align r4 = android.graphics.Paint.Align.LEFT
            r3.setTextAlign(r4)
            java.lang.Object r3 = r7.f25150a
            s3.g r3 = (p323s3.C5953g) r3
            android.graphics.RectF r3 = r3.f22866b
            float r3 = r3.left
            goto L7e
        L6d:
            if (r3 != r6) goto L80
            android.graphics.Paint r3 = r7.f22246e
            android.graphics.Paint$Align r4 = android.graphics.Paint.Align.LEFT
            r3.setTextAlign(r4)
            java.lang.Object r3 = r7.f25150a
            s3.g r3 = (p323s3.C5953g) r3
            android.graphics.RectF r3 = r3.f22866b
            float r3 = r3.right
        L7e:
            float r3 = r3 + r1
            goto L90
        L80:
            android.graphics.Paint r3 = r7.f22246e
            android.graphics.Paint$Align r4 = android.graphics.Paint.Align.RIGHT
            r3.setTextAlign(r4)
            java.lang.Object r3 = r7.f25150a
            s3.g r3 = (p323s3.C5953g) r3
            android.graphics.RectF r3 = r3.f22866b
            float r3 = r3.right
        L8f:
            float r3 = r3 - r1
        L90:
            r7.m12111o(r8, r3, r0, r2)
        L93:
            return
    }

    /* renamed from: t */
    public void m12116t(android.graphics.Canvas r9) {
            r8 = this;
            k3.i r0 = r8.f22287h
            boolean r1 = r0.f16271a
            if (r1 == 0) goto L60
            boolean r1 = r0.f16262q
            if (r1 != 0) goto Lb
            goto L60
        Lb:
            android.graphics.Paint r1 = r8.f22247f
            int r0 = r0.f16254i
            r1.setColor(r0)
            android.graphics.Paint r0 = r8.f22247f
            k3.i r1 = r8.f22287h
            float r1 = r1.f16255j
            r0.setStrokeWidth(r1)
            k3.i r0 = r8.f22287h
            k3.i$a r0 = r0.f16309G
            k3.i$a r1 = p181k3.C3685i.a.f16312Y
            if (r0 != r1) goto L3d
            java.lang.Object r0 = r8.f25150a
            r1 = r0
            s3.g r1 = (p323s3.C5953g) r1
            android.graphics.RectF r1 = r1.f22866b
            float r3 = r1.left
            r1 = r0
            s3.g r1 = (p323s3.C5953g) r1
            android.graphics.RectF r1 = r1.f22866b
            float r4 = r1.top
            r1 = r0
            s3.g r1 = (p323s3.C5953g) r1
            android.graphics.RectF r1 = r1.f22866b
            float r5 = r1.left
            s3.g r0 = (p323s3.C5953g) r0
            goto L56
        L3d:
            java.lang.Object r0 = r8.f25150a
            r1 = r0
            s3.g r1 = (p323s3.C5953g) r1
            android.graphics.RectF r1 = r1.f22866b
            float r3 = r1.right
            r1 = r0
            s3.g r1 = (p323s3.C5953g) r1
            android.graphics.RectF r1 = r1.f22866b
            float r4 = r1.top
            r1 = r0
            s3.g r1 = (p323s3.C5953g) r1
            android.graphics.RectF r1 = r1.f22866b
            float r5 = r1.right
            s3.g r0 = (p323s3.C5953g) r0
        L56:
            android.graphics.RectF r0 = r0.f22866b
            float r6 = r0.bottom
            android.graphics.Paint r7 = r8.f22247f
            r2 = r9
            r2.drawLine(r3, r4, r5, r6, r7)
        L60:
            return
    }

    /* renamed from: u */
    public void m12117u(android.graphics.Canvas r7) {
            r6 = this;
            k3.i r0 = r6.f22287h
            boolean r1 = r0.f16271a
            if (r1 != 0) goto L7
            return
        L7:
            boolean r0 = r0.f16261p
            if (r0 == 0) goto L52
            int r0 = r7.save()
            android.graphics.RectF r1 = r6.m12112p()
            r7.clipRect(r1)
            float[] r1 = r6.m12113q()
            android.graphics.Paint r2 = r6.f22245d
            k3.i r3 = r6.f22287h
            int r3 = r3.f16252g
            r2.setColor(r3)
            android.graphics.Paint r2 = r6.f22245d
            k3.i r3 = r6.f22287h
            float r3 = r3.f16253h
            r2.setStrokeWidth(r3)
            android.graphics.Paint r2 = r6.f22245d
            k3.i r3 = r6.f22287h
            java.util.Objects.requireNonNull(r3)
            r3 = 0
            r2.setPathEffect(r3)
            android.graphics.Path r2 = r6.f22289j
            r2.reset()
            r3 = 0
        L3d:
            int r4 = r1.length
            if (r3 >= r4) goto L4f
            android.graphics.Path r4 = r6.m12114r(r2, r3, r1)
            android.graphics.Paint r5 = r6.f22245d
            r7.drawPath(r4, r5)
            r2.reset()
            int r3 = r3 + 2
            goto L3d
        L4f:
            r7.restoreToCount(r0)
        L52:
            k3.i r7 = r6.f22287h
            java.util.Objects.requireNonNull(r7)
            return
    }

    /* renamed from: v */
    public void m12118v(android.graphics.Canvas r11) {
            r10 = this;
            k3.i r0 = r10.f22287h
            java.util.List<k3.g> r0 = r0.f16264s
            if (r0 == 0) goto L8f
            int r1 = r0.size()
            if (r1 > 0) goto Le
            goto L8f
        Le:
            float[] r1 = r10.f22295p
            r2 = 0
            r3 = 0
            r1[r3] = r2
            r4 = 1
            r1[r4] = r2
            android.graphics.Path r5 = r10.f22294o
            r5.reset()
            r6 = 0
        L1d:
            int r7 = r0.size()
            if (r6 >= r7) goto L8f
            java.lang.Object r7 = r0.get(r6)
            k3.g r7 = (p181k3.C3683g) r7
            boolean r7 = r7.f16271a
            if (r7 != 0) goto L2e
            goto L8c
        L2e:
            int r7 = r11.save()
            android.graphics.RectF r8 = r10.f22296q
            java.lang.Object r9 = r10.f25150a
            s3.g r9 = (p323s3.C5953g) r9
            android.graphics.RectF r9 = r9.f22866b
            r8.set(r9)
            android.graphics.RectF r8 = r10.f22296q
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r8.inset(r2, r9)
            android.graphics.RectF r8 = r10.f22296q
            r11.clipRect(r8)
            android.graphics.Paint r8 = r10.f22248g
            android.graphics.Paint$Style r9 = android.graphics.Paint.Style.STROKE
            r8.setStyle(r9)
            android.graphics.Paint r8 = r10.f22248g
            r8.setColor(r3)
            android.graphics.Paint r8 = r10.f22248g
            r8.setStrokeWidth(r2)
            android.graphics.Paint r8 = r10.f22248g
            r9 = 0
            r8.setPathEffect(r9)
            r1[r4] = r2
            s3.e r8 = r10.f22244c
            r8.m12371f(r1)
            java.lang.Object r8 = r10.f25150a
            s3.g r8 = (p323s3.C5953g) r8
            android.graphics.RectF r8 = r8.f22866b
            float r8 = r8.left
            r9 = r1[r4]
            r5.moveTo(r8, r9)
            java.lang.Object r8 = r10.f25150a
            s3.g r8 = (p323s3.C5953g) r8
            android.graphics.RectF r8 = r8.f22866b
            float r8 = r8.right
            r9 = r1[r4]
            r5.lineTo(r8, r9)
            android.graphics.Paint r8 = r10.f22248g
            r11.drawPath(r5, r8)
            r5.reset()
            r11.restoreToCount(r7)
        L8c:
            int r6 = r6 + 1
            goto L1d
        L8f:
            return
    }
}
