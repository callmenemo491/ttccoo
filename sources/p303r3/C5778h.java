package p303r3;

/* renamed from: r3.h */
/* loaded from: classes.dex */
public class C5778h extends p303r3.AbstractC5771a {

    /* renamed from: h */
    public p181k3.C3684h f22279h;

    /* renamed from: i */
    public android.graphics.Path f22280i;

    /* renamed from: j */
    public float[] f22281j;

    /* renamed from: k */
    public android.graphics.RectF f22282k;

    /* renamed from: l */
    public float[] f22283l;

    /* renamed from: m */
    public android.graphics.RectF f22284m;

    /* renamed from: n */
    public float[] f22285n;

    /* renamed from: o */
    public android.graphics.Path f22286o;

    public C5778h(p323s3.C5953g r1, p181k3.C3684h r2, p323s3.C5951e r3) {
            r0 = this;
            r0.<init>(r1, r3, r2)
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r0.f22280i = r1
            r1 = 2
            float[] r3 = new float[r1]
            r0.f22281j = r3
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r0.f22282k = r3
            float[] r1 = new float[r1]
            r0.f22283l = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f22284m = r1
            r1 = 4
            float[] r1 = new float[r1]
            r0.f22285n = r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r0.f22286o = r1
            r0.f22279h = r2
            android.graphics.Paint r1 = r0.f22246e
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.setColor(r2)
            android.graphics.Paint r1 = r0.f22246e
            android.graphics.Paint$Align r2 = android.graphics.Paint.Align.CENTER
            r1.setTextAlign(r2)
            android.graphics.Paint r1 = r0.f22246e
            r2 = 1092616192(0x41200000, float:10.0)
            float r2 = p323s3.AbstractC5952f.m12377d(r2)
            r1.setTextSize(r2)
            return
    }

    @Override // p303r3.AbstractC5771a
    /* renamed from: m */
    public void mo12086m(float r3, float r4, boolean r5) {
            r2 = this;
            java.lang.Object r0 = r2.f25150a
            s3.g r0 = (p323s3.C5953g) r0
            float r0 = r0.m12380a()
            r1 = 1092616192(0x41200000, float:10.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L5c
            java.lang.Object r0 = r2.f25150a
            s3.g r0 = (p323s3.C5953g) r0
            boolean r0 = r0.m12381b()
            if (r0 != 0) goto L5c
            s3.e r3 = r2.f22244c
            java.lang.Object r4 = r2.f25150a
            r0 = r4
            s3.g r0 = (p323s3.C5953g) r0
            android.graphics.RectF r0 = r0.f22866b
            float r0 = r0.left
            s3.g r4 = (p323s3.C5953g) r4
            android.graphics.RectF r4 = r4.f22866b
            float r4 = r4.top
            s3.b r3 = r3.m12367b(r0, r4)
            s3.e r4 = r2.f22244c
            java.lang.Object r0 = r2.f25150a
            r1 = r0
            s3.g r1 = (p323s3.C5953g) r1
            android.graphics.RectF r1 = r1.f22866b
            float r1 = r1.right
            s3.g r0 = (p323s3.C5953g) r0
            android.graphics.RectF r0 = r0.f22866b
            float r0 = r0.top
            s3.b r4 = r4.m12367b(r1, r0)
            if (r5 == 0) goto L4a
            double r0 = r4.f22835b
            float r5 = (float) r0
            double r0 = r3.f22835b
            goto L4f
        L4a:
            double r0 = r3.f22835b
            float r5 = (float) r0
            double r0 = r4.f22835b
        L4f:
            float r0 = (float) r0
            s3.d<s3.b> r1 = p323s3.C5948b.f22834d
            r1.m12363c(r3)
            s3.d<s3.b> r3 = p323s3.C5948b.f22834d
            r3.m12363c(r4)
            r3 = r5
            r4 = r0
        L5c:
            super.mo12087n(r3, r4)
            r2.m12102o()
            return
    }

    @Override // p303r3.AbstractC5771a
    /* renamed from: n */
    public void mo12087n(float r1, float r2) {
            r0 = this;
            super.mo12087n(r1, r2)
            r0.m12102o()
            return
    }

    /* renamed from: o */
    public void m12102o() {
            r5 = this;
            k3.h r0 = r5.f22279h
            java.lang.String r0 = r0.m8137c()
            android.graphics.Paint r1 = r5.f22246e
            k3.h r2 = r5.f22279h
            java.util.Objects.requireNonNull(r2)
            r2 = 0
            r1.setTypeface(r2)
            android.graphics.Paint r1 = r5.f22246e
            k3.h r2 = r5.f22279h
            float r2 = r2.f16274d
            r1.setTextSize(r2)
            android.graphics.Paint r1 = r5.f22246e
            s3.a r0 = p323s3.AbstractC5952f.m12375b(r1, r0)
            float r1 = r0.f22832b
            android.graphics.Paint r2 = r5.f22246e
            java.lang.String r3 = "Q"
            int r2 = p323s3.AbstractC5952f.m12374a(r2, r3)
            float r2 = (float) r2
            k3.h r3 = r5.f22279h
            java.util.Objects.requireNonNull(r3)
            r3 = 0
            s3.a r3 = p323s3.AbstractC5952f.m12378e(r1, r2, r3)
            k3.h r4 = r5.f22279h
            java.lang.Math.round(r1)
            java.util.Objects.requireNonNull(r4)
            k3.h r1 = r5.f22279h
            java.lang.Math.round(r2)
            java.util.Objects.requireNonNull(r1)
            k3.h r1 = r5.f22279h
            float r2 = r3.f22832b
            java.lang.Math.round(r2)
            java.util.Objects.requireNonNull(r1)
            k3.h r1 = r5.f22279h
            float r2 = r3.f22833c
            int r2 = java.lang.Math.round(r2)
            r1.f16302z = r2
            s3.d<s3.a> r1 = p323s3.C5947a.f22831d
            r1.m12363c(r3)
            s3.d<s3.a> r1 = p323s3.C5947a.f22831d
            r1.m12363c(r0)
            return
    }

    /* renamed from: p */
    public void m12103p(android.graphics.Canvas r1, float r2, float r3, android.graphics.Path r4) {
            r0 = this;
            java.lang.Object r3 = r0.f25150a
            s3.g r3 = (p323s3.C5953g) r3
            android.graphics.RectF r3 = r3.f22866b
            float r3 = r3.bottom
            r4.moveTo(r2, r3)
            java.lang.Object r3 = r0.f25150a
            s3.g r3 = (p323s3.C5953g) r3
            android.graphics.RectF r3 = r3.f22866b
            float r3 = r3.top
            r4.lineTo(r2, r3)
            android.graphics.Paint r2 = r0.f22245d
            r1.drawPath(r4, r2)
            r4.reset()
            return
    }

    /* renamed from: q */
    public void m12104q(android.graphics.Canvas r9, java.lang.String r10, float r11, float r12, p323s3.C5949c r13, float r14) {
            r8 = this;
            android.graphics.Paint r0 = r8.f22246e
            android.graphics.Paint$FontMetrics r1 = p323s3.AbstractC5952f.f22864j
            float r1 = r0.getFontMetrics(r1)
            int r2 = r10.length()
            android.graphics.Rect r3 = p323s3.AbstractC5952f.f22863i
            r4 = 0
            r0.getTextBounds(r10, r4, r2, r3)
            android.graphics.Rect r2 = p323s3.AbstractC5952f.f22863i
            int r2 = r2.left
            float r2 = (float) r2
            r3 = 0
            float r2 = r3 - r2
            android.graphics.Paint$FontMetrics r4 = p323s3.AbstractC5952f.f22864j
            float r4 = r4.ascent
            float r4 = -r4
            float r4 = r4 + r3
            android.graphics.Paint$Align r5 = r0.getTextAlign()
            android.graphics.Paint$Align r6 = android.graphics.Paint.Align.LEFT
            r0.setTextAlign(r6)
            int r6 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r6 == 0) goto L78
            android.graphics.Rect r3 = p323s3.AbstractC5952f.f22863i
            int r3 = r3.width()
            float r3 = (float) r3
            r6 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r6
            float r2 = r2 - r3
            float r3 = r1 * r6
            float r4 = r4 - r3
            float r3 = r13.f22838b
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L48
            float r3 = r13.f22839c
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 == 0) goto L68
        L48:
            android.graphics.Rect r3 = p323s3.AbstractC5952f.f22863i
            int r3 = r3.width()
            float r3 = (float) r3
            s3.a r1 = p323s3.AbstractC5952f.m12378e(r3, r1, r14)
            float r3 = r1.f22832b
            float r7 = r13.f22838b
            float r7 = r7 - r6
            float r7 = r7 * r3
            float r11 = r11 - r7
            float r3 = r1.f22833c
            float r13 = r13.f22839c
            float r13 = r13 - r6
            float r13 = r13 * r3
            float r12 = r12 - r13
            s3.d<s3.a> r13 = p323s3.C5947a.f22831d
            r13.m12363c(r1)
        L68:
            r9.save()
            r9.translate(r11, r12)
            r9.rotate(r14)
            r9.drawText(r10, r2, r4, r0)
            r9.restore()
            goto L9a
        L78:
            float r14 = r13.f22838b
            int r14 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r14 != 0) goto L84
            float r14 = r13.f22839c
            int r14 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r14 == 0) goto L95
        L84:
            android.graphics.Rect r14 = p323s3.AbstractC5952f.f22863i
            int r14 = r14.width()
            float r14 = (float) r14
            float r3 = r13.f22838b
            float r14 = r14 * r3
            float r2 = r2 - r14
            float r13 = r13.f22839c
            float r1 = r1 * r13
            float r4 = r4 - r1
        L95:
            float r2 = r2 + r11
            float r4 = r4 + r12
            r9.drawText(r10, r2, r4, r0)
        L9a:
            r0.setTextAlign(r5)
            return
    }

    /* renamed from: r */
    public void m12105r(android.graphics.Canvas r11, float r12, p323s3.C5949c r13) {
            r10 = this;
            k3.h r0 = r10.f22279h
            java.util.Objects.requireNonNull(r0)
            k3.h r0 = r10.f22279h
            java.util.Objects.requireNonNull(r0)
            k3.h r0 = r10.f22279h
            int r0 = r0.f16257l
            int r0 = r0 * 2
            float[] r1 = new float[r0]
            r2 = 0
            r3 = 0
        L14:
            if (r3 >= r0) goto L23
            k3.h r4 = r10.f22279h
            float[] r4 = r4.f16256k
            int r5 = r3 / 2
            r4 = r4[r5]
            r1[r3] = r4
            int r3 = r3 + 2
            goto L14
        L23:
            s3.e r3 = r10.f22244c
            r3.m12371f(r1)
        L28:
            if (r2 >= r0) goto L58
            r6 = r1[r2]
            java.lang.Object r3 = r10.f25150a
            s3.g r3 = (p323s3.C5953g) r3
            boolean r3 = r3.m12387h(r6)
            if (r3 == 0) goto L55
            k3.h r3 = r10.f22279h
            m3.c r3 = r3.m8138d()
            k3.h r4 = r10.f22279h
            float[] r4 = r4.f16256k
            int r5 = r2 / 2
            r4 = r4[r5]
            java.lang.String r5 = r3.mo9734a(r4)
            k3.h r3 = r10.f22279h
            java.util.Objects.requireNonNull(r3)
            r9 = 0
            r3 = r10
            r4 = r11
            r7 = r12
            r8 = r13
            r3.m12104q(r4, r5, r6, r7, r8, r9)
        L55:
            int r2 = r2 + 2
            goto L28
        L58:
            return
    }

    /* renamed from: s */
    public android.graphics.RectF m12106s() {
            r3 = this;
            android.graphics.RectF r0 = r3.f22282k
            java.lang.Object r1 = r3.f25150a
            s3.g r1 = (p323s3.C5953g) r1
            android.graphics.RectF r1 = r1.f22866b
            r0.set(r1)
            android.graphics.RectF r0 = r3.f22282k
            k3.a r1 = r3.f22243b
            float r1 = r1.f16253h
            float r1 = -r1
            r2 = 0
            r0.inset(r1, r2)
            android.graphics.RectF r0 = r3.f22282k
            return r0
    }

    /* renamed from: t */
    public void m12107t(android.graphics.Canvas r9) {
            r8 = this;
            k3.h r0 = r8.f22279h
            boolean r1 = r0.f16271a
            if (r1 == 0) goto L94
            boolean r1 = r0.f16263r
            if (r1 != 0) goto Lc
            goto L94
        Lc:
            float r0 = r0.f16273c
            android.graphics.Paint r1 = r8.f22246e
            r2 = 0
            r1.setTypeface(r2)
            android.graphics.Paint r1 = r8.f22246e
            k3.h r2 = r8.f22279h
            float r2 = r2.f16274d
            r1.setTextSize(r2)
            android.graphics.Paint r1 = r8.f22246e
            k3.h r2 = r8.f22279h
            int r2 = r2.f16275e
            r1.setColor(r2)
            r1 = 0
            s3.c r2 = p323s3.C5949c.m12359b(r1, r1)
            k3.h r3 = r8.f22279h
            int r4 = r3.f16301A
            r5 = 1
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r4 != r5) goto L43
            r2.f22838b = r7
            r2.f22839c = r6
            java.lang.Object r1 = r8.f25150a
            s3.g r1 = (p323s3.C5953g) r1
            android.graphics.RectF r1 = r1.f22866b
            float r1 = r1.top
            goto L76
        L43:
            r5 = 4
            if (r4 != r5) goto L57
            r2.f22838b = r7
            r2.f22839c = r6
            java.lang.Object r1 = r8.f25150a
            s3.g r1 = (p323s3.C5953g) r1
            android.graphics.RectF r1 = r1.f22866b
            float r1 = r1.top
            float r1 = r1 + r0
            int r0 = r3.f16302z
            float r0 = (float) r0
            goto L8b
        L57:
            r5 = 2
            if (r4 != r5) goto L63
        L5a:
            r2.f22838b = r7
            r2.f22839c = r1
            java.lang.Object r1 = r8.f25150a
            s3.g r1 = (p323s3.C5953g) r1
            goto L87
        L63:
            r5 = 5
            r2.f22838b = r7
            if (r4 != r5) goto L78
            r2.f22839c = r1
            java.lang.Object r1 = r8.f25150a
            s3.g r1 = (p323s3.C5953g) r1
            android.graphics.RectF r1 = r1.f22866b
            float r1 = r1.bottom
            float r1 = r1 - r0
            int r0 = r3.f16302z
            float r0 = (float) r0
        L76:
            float r1 = r1 - r0
            goto L8c
        L78:
            r2.f22839c = r6
            java.lang.Object r3 = r8.f25150a
            s3.g r3 = (p323s3.C5953g) r3
            android.graphics.RectF r3 = r3.f22866b
            float r3 = r3.top
            float r3 = r3 - r0
            r8.m12105r(r9, r3, r2)
            goto L5a
        L87:
            android.graphics.RectF r1 = r1.f22866b
            float r1 = r1.bottom
        L8b:
            float r1 = r1 + r0
        L8c:
            r8.m12105r(r9, r1, r2)
            s3.d<s3.c> r9 = p323s3.C5949c.f22837d
            r9.m12363c(r2)
        L94:
            return
    }

    /* renamed from: u */
    public void m12108u(android.graphics.Canvas r10) {
            r9 = this;
            k3.h r0 = r9.f22279h
            boolean r1 = r0.f16262q
            if (r1 == 0) goto L65
            boolean r1 = r0.f16271a
            if (r1 != 0) goto Lb
            goto L65
        Lb:
            android.graphics.Paint r1 = r9.f22247f
            int r0 = r0.f16254i
            r1.setColor(r0)
            android.graphics.Paint r0 = r9.f22247f
            k3.h r1 = r9.f22279h
            float r1 = r1.f16255j
            r0.setStrokeWidth(r1)
            android.graphics.Paint r0 = r9.f22247f
            k3.h r1 = r9.f22279h
            java.util.Objects.requireNonNull(r1)
            r1 = 0
            r0.setPathEffect(r1)
            k3.h r0 = r9.f22279h
            int r0 = r0.f16301A
            r1 = 1
            r2 = 3
            if (r0 == r1) goto L33
            r1 = 4
            if (r0 == r1) goto L33
            if (r0 != r2) goto L46
        L33:
            java.lang.Object r0 = r9.f25150a
            s3.g r0 = (p323s3.C5953g) r0
            android.graphics.RectF r0 = r0.f22866b
            float r4 = r0.left
            float r7 = r0.top
            float r6 = r0.right
            android.graphics.Paint r8 = r9.f22247f
            r3 = r10
            r5 = r7
            r3.drawLine(r4, r5, r6, r7, r8)
        L46:
            k3.h r0 = r9.f22279h
            int r0 = r0.f16301A
            r1 = 2
            if (r0 == r1) goto L52
            r1 = 5
            if (r0 == r1) goto L52
            if (r0 != r2) goto L65
        L52:
            java.lang.Object r0 = r9.f25150a
            s3.g r0 = (p323s3.C5953g) r0
            android.graphics.RectF r0 = r0.f22866b
            float r2 = r0.left
            float r5 = r0.bottom
            float r4 = r0.right
            android.graphics.Paint r6 = r9.f22247f
            r1 = r10
            r3 = r5
            r1.drawLine(r2, r3, r4, r5, r6)
        L65:
            return
    }

    /* renamed from: v */
    public void m12109v(android.graphics.Canvas r8) {
            r7 = this;
            k3.h r0 = r7.f22279h
            boolean r1 = r0.f16261p
            if (r1 == 0) goto L7e
            boolean r0 = r0.f16271a
            if (r0 != 0) goto Lb
            goto L7e
        Lb:
            int r0 = r8.save()
            android.graphics.RectF r1 = r7.m12106s()
            r8.clipRect(r1)
            float[] r1 = r7.f22281j
            int r1 = r1.length
            k3.a r2 = r7.f22243b
            int r2 = r2.f16257l
            int r2 = r2 * 2
            if (r1 == r2) goto L2b
            k3.h r1 = r7.f22279h
            int r1 = r1.f16257l
            int r1 = r1 * 2
            float[] r1 = new float[r1]
            r7.f22281j = r1
        L2b:
            float[] r1 = r7.f22281j
            r2 = 0
            r3 = 0
        L2f:
            int r4 = r1.length
            if (r3 >= r4) goto L45
            k3.h r4 = r7.f22279h
            float[] r4 = r4.f16256k
            int r5 = r3 / 2
            r6 = r4[r5]
            r1[r3] = r6
            int r6 = r3 + 1
            r4 = r4[r5]
            r1[r6] = r4
            int r3 = r3 + 2
            goto L2f
        L45:
            s3.e r3 = r7.f22244c
            r3.m12371f(r1)
            android.graphics.Paint r3 = r7.f22245d
            k3.h r4 = r7.f22279h
            int r4 = r4.f16252g
            r3.setColor(r4)
            android.graphics.Paint r3 = r7.f22245d
            k3.h r4 = r7.f22279h
            float r4 = r4.f16253h
            r3.setStrokeWidth(r4)
            android.graphics.Paint r3 = r7.f22245d
            k3.h r4 = r7.f22279h
            java.util.Objects.requireNonNull(r4)
            r4 = 0
            r3.setPathEffect(r4)
            android.graphics.Path r3 = r7.f22280i
            r3.reset()
        L6c:
            int r4 = r1.length
            if (r2 >= r4) goto L7b
            r4 = r1[r2]
            int r5 = r2 + 1
            r5 = r1[r5]
            r7.m12103p(r8, r4, r5, r3)
            int r2 = r2 + 2
            goto L6c
        L7b:
            r8.restoreToCount(r0)
        L7e:
            return
    }

    /* renamed from: w */
    public void m12110w(android.graphics.Canvas r13) {
            r12 = this;
            k3.h r0 = r12.f22279h
            java.util.List<k3.g> r0 = r0.f16264s
            if (r0 == 0) goto La7
            int r1 = r0.size()
            if (r1 > 0) goto Le
            goto La7
        Le:
            float[] r1 = r12.f22283l
            r2 = 0
            r3 = 0
            r1[r3] = r2
            r4 = 1
            r1[r4] = r2
            r5 = 0
        L18:
            int r6 = r0.size()
            if (r5 >= r6) goto La7
            java.lang.Object r6 = r0.get(r5)
            k3.g r6 = (p181k3.C3683g) r6
            boolean r6 = r6.f16271a
            if (r6 != 0) goto L29
            goto La3
        L29:
            int r6 = r13.save()
            android.graphics.RectF r7 = r12.f22284m
            java.lang.Object r8 = r12.f25150a
            s3.g r8 = (p323s3.C5953g) r8
            android.graphics.RectF r8 = r8.f22866b
            r7.set(r8)
            android.graphics.RectF r7 = r12.f22284m
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r7.inset(r8, r2)
            android.graphics.RectF r7 = r12.f22284m
            r13.clipRect(r7)
            r1[r3] = r2
            r1[r4] = r2
            s3.e r7 = r12.f22244c
            r7.m12371f(r1)
            float[] r7 = r12.f22285n
            r8 = r1[r3]
            r7[r3] = r8
            java.lang.Object r8 = r12.f25150a
            s3.g r8 = (p323s3.C5953g) r8
            android.graphics.RectF r8 = r8.f22866b
            float r9 = r8.top
            r7[r4] = r9
            r9 = r1[r3]
            r10 = 2
            r7[r10] = r9
            float r8 = r8.bottom
            r9 = 3
            r7[r9] = r8
            android.graphics.Path r7 = r12.f22286o
            r7.reset()
            android.graphics.Path r7 = r12.f22286o
            float[] r8 = r12.f22285n
            r11 = r8[r3]
            r8 = r8[r4]
            r7.moveTo(r11, r8)
            android.graphics.Path r7 = r12.f22286o
            float[] r8 = r12.f22285n
            r10 = r8[r10]
            r8 = r8[r9]
            r7.lineTo(r10, r8)
            android.graphics.Paint r7 = r12.f22248g
            android.graphics.Paint$Style r8 = android.graphics.Paint.Style.STROKE
            r7.setStyle(r8)
            android.graphics.Paint r7 = r12.f22248g
            r7.setColor(r3)
            android.graphics.Paint r7 = r12.f22248g
            r7.setStrokeWidth(r2)
            android.graphics.Paint r7 = r12.f22248g
            r8 = 0
            r7.setPathEffect(r8)
            android.graphics.Path r7 = r12.f22286o
            android.graphics.Paint r8 = r12.f22248g
            r13.drawPath(r7, r8)
            r13.restoreToCount(r6)
        La3:
            int r5 = r5 + 1
            goto L18
        La7:
            return
    }
}
