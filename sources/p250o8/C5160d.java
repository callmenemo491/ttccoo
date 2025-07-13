package p250o8;

/* renamed from: o8.d */
/* loaded from: classes.dex */
public final class C5160d extends p250o8.AbstractC5169m<p250o8.C5164h> {

    /* renamed from: c */
    public int f20235c;

    /* renamed from: d */
    public float f20236d;

    /* renamed from: e */
    public float f20237e;

    /* renamed from: f */
    public float f20238f;

    public C5160d(p250o8.C5164h r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.f20235c = r1
            return
    }

    @Override // p250o8.AbstractC5169m
    /* renamed from: a */
    public void mo11471a(android.graphics.Canvas r5, float r6) {
            r4 = this;
            S extends o8.c r0 = r4.f20276a
            r1 = r0
            o8.h r1 = (p250o8.C5164h) r1
            int r1 = r1.f20254g
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            o8.h r0 = (p250o8.C5164h) r0
            int r0 = r0.f20255h
            float r0 = (float) r0
            float r1 = r1 + r0
            r5.translate(r1, r1)
            r0 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r5.rotate(r0)
            float r0 = -r1
            r5.clipRect(r0, r0, r1, r1)
            S extends o8.c r5 = r4.f20276a
            r0 = r5
            o8.h r0 = (p250o8.C5164h) r0
            int r0 = r0.f20256i
            r1 = 1
            if (r0 != 0) goto L29
            r0 = 1
            goto L2a
        L29:
            r0 = -1
        L2a:
            r4.f20235c = r0
            r0 = r5
            o8.h r0 = (p250o8.C5164h) r0
            int r0 = r0.f20229a
            float r0 = (float) r0
            float r0 = r0 * r6
            r4.f20236d = r0
            r0 = r5
            o8.h r0 = (p250o8.C5164h) r0
            int r0 = r0.f20230b
            float r0 = (float) r0
            float r0 = r0 * r6
            r4.f20237e = r0
            r0 = r5
            o8.h r0 = (p250o8.C5164h) r0
            int r0 = r0.f20254g
            o8.h r5 = (p250o8.C5164h) r5
            int r5 = r5.f20229a
            int r0 = r0 - r5
            float r5 = (float) r0
            float r5 = r5 / r2
            r4.f20238f = r5
            o8.l r5 = r4.f20277b
            boolean r5 = r5.m11486f()
            r0 = 1065353216(0x3f800000, float:1.0)
            r3 = 2
            if (r5 == 0) goto L61
            S extends o8.c r5 = r4.f20276a
            o8.h r5 = (p250o8.C5164h) r5
            int r5 = r5.f20233e
            if (r5 == r3) goto L71
        L61:
            o8.l r5 = r4.f20277b
            boolean r5 = r5.m11485e()
            if (r5 == 0) goto L82
            S extends o8.c r5 = r4.f20276a
            o8.h r5 = (p250o8.C5164h) r5
            int r5 = r5.f20234f
            if (r5 != r1) goto L82
        L71:
            float r5 = r4.f20238f
            float r0 = r0 - r6
            S extends o8.c r6 = r4.f20276a
            o8.h r6 = (p250o8.C5164h) r6
            int r6 = r6.f20229a
            float r6 = (float) r6
            float r0 = r0 * r6
            float r0 = r0 / r2
            float r0 = r0 + r5
            r4.f20238f = r0
            goto Lb2
        L82:
            o8.l r5 = r4.f20277b
            boolean r5 = r5.m11486f()
            if (r5 == 0) goto L92
            S extends o8.c r5 = r4.f20276a
            o8.h r5 = (p250o8.C5164h) r5
            int r5 = r5.f20233e
            if (r5 == r1) goto La2
        L92:
            o8.l r5 = r4.f20277b
            boolean r5 = r5.m11485e()
            if (r5 == 0) goto Lb2
            S extends o8.c r5 = r4.f20276a
            o8.h r5 = (p250o8.C5164h) r5
            int r5 = r5.f20234f
            if (r5 != r3) goto Lb2
        La2:
            float r5 = r4.f20238f
            float r0 = r0 - r6
            S extends o8.c r6 = r4.f20276a
            o8.h r6 = (p250o8.C5164h) r6
            int r6 = r6.f20229a
            float r6 = (float) r6
            float r0 = r0 * r6
            float r0 = r0 / r2
            float r5 = r5 - r0
            r4.f20238f = r5
        Lb2:
            return
    }

    @Override // p250o8.AbstractC5169m
    /* renamed from: b */
    public void mo11472b(android.graphics.Canvas r11, android.graphics.Paint r12, float r13, float r14, int r15) {
            r10 = this;
            int r0 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r0 != 0) goto L5
            return
        L5:
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r12.setStyle(r0)
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
            r12.setStrokeCap(r0)
            r0 = 1
            r12.setAntiAlias(r0)
            r12.setColor(r15)
            float r15 = r10.f20236d
            r12.setStrokeWidth(r15)
            r15 = 1135869952(0x43b40000, float:360.0)
            float r0 = r13 * r15
            int r1 = r10.f20235c
            float r1 = (float) r1
            float r0 = r0 * r1
            int r2 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r2 < 0) goto L29
            goto L2c
        L29:
            r2 = 1065353216(0x3f800000, float:1.0)
            float r14 = r14 + r2
        L2c:
            float r14 = r14 - r13
            float r14 = r14 * r15
            float r14 = r14 * r1
            android.graphics.RectF r3 = new android.graphics.RectF
            float r13 = r10.f20238f
            float r1 = -r13
            r3.<init>(r1, r1, r13, r13)
            r6 = 0
            r2 = r11
            r4 = r0
            r5 = r14
            r7 = r12
            r2.drawArc(r3, r4, r5, r6, r7)
            float r13 = r10.f20237e
            r1 = 0
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r13 <= 0) goto L78
            float r13 = java.lang.Math.abs(r14)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L78
            android.graphics.Paint$Style r13 = android.graphics.Paint.Style.FILL
            r12.setStyle(r13)
            android.graphics.RectF r13 = new android.graphics.RectF
            float r15 = r10.f20237e
            float r1 = -r15
            r13.<init>(r1, r1, r15, r15)
            float r5 = r10.f20236d
            float r6 = r10.f20237e
            r8 = 1
            r2 = r10
            r3 = r11
            r4 = r12
            r7 = r0
            r9 = r13
            r2.m11476f(r3, r4, r5, r6, r7, r8, r9)
            float r4 = r10.f20236d
            float r5 = r10.f20237e
            float r6 = r0 + r14
            r7 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            r8 = r13
            r1.m11476f(r2, r3, r4, r5, r6, r7, r8)
        L78:
            return
    }

    @Override // p250o8.AbstractC5169m
    /* renamed from: c */
    public void mo11473c(android.graphics.Canvas r8, android.graphics.Paint r9) {
            r7 = this;
            S extends o8.c r0 = r7.f20276a
            o8.h r0 = (p250o8.C5164h) r0
            int r0 = r0.f20232d
            o8.l r1 = r7.f20277b
            int r1 = r1.f20275h0
            int r0 = p124h7.C2939x3.m7284j(r0, r1)
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r9.setStyle(r1)
            android.graphics.Paint$Cap r1 = android.graphics.Paint.Cap.BUTT
            r9.setStrokeCap(r1)
            r1 = 1
            r9.setAntiAlias(r1)
            r9.setColor(r0)
            float r0 = r7.f20236d
            r9.setStrokeWidth(r0)
            android.graphics.RectF r2 = new android.graphics.RectF
            float r0 = r7.f20238f
            float r1 = -r0
            r2.<init>(r1, r1, r0, r0)
            r3 = 0
            r4 = 1135869952(0x43b40000, float:360.0)
            r5 = 0
            r1 = r8
            r6 = r9
            r1.drawArc(r2, r3, r4, r5, r6)
            return
    }

    @Override // p250o8.AbstractC5169m
    /* renamed from: d */
    public int mo11474d() {
            r2 = this;
            S extends o8.c r0 = r2.f20276a
            o8.h r0 = (p250o8.C5164h) r0
            int r1 = r0.f20254g
            int r0 = r0.f20255h
            int r0 = r0 * 2
            int r0 = r0 + r1
            return r0
    }

    @Override // p250o8.AbstractC5169m
    /* renamed from: e */
    public int mo11475e() {
            r2 = this;
            S extends o8.c r0 = r2.f20276a
            o8.h r0 = (p250o8.C5164h) r0
            int r1 = r0.f20254g
            int r0 = r0.f20255h
            int r0 = r0 * 2
            int r0 = r0 + r1
            return r0
    }

    /* renamed from: f */
    public final void m11476f(android.graphics.Canvas r14, android.graphics.Paint r15, float r16, float r17, float r18, boolean r19, android.graphics.RectF r20) {
            r13 = this;
            r0 = r13
            r7 = r14
            if (r19 == 0) goto L9
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto Ld
        L9:
            r1 = 1065353216(0x3f800000, float:1.0)
            r8 = 1065353216(0x3f800000, float:1.0)
        Ld:
            r14.save()
            r1 = r18
            r14.rotate(r1)
            float r1 = r0.f20238f
            r9 = 1073741824(0x40000000, float:2.0)
            float r10 = r16 / r9
            float r1 = r1 - r10
            float r2 = r1 + r17
            float r1 = r8 * r17
            int r3 = r0.f20235c
            float r3 = (float) r3
            float r3 = r3 * r1
            r11 = 0
            float r3 = java.lang.Math.min(r11, r3)
            float r4 = r0.f20238f
            float r4 = r4 + r10
            float r4 = r4 - r17
            int r5 = r0.f20235c
            float r5 = (float) r5
            float r1 = r1 * r5
            float r5 = java.lang.Math.max(r11, r1)
            r1 = r14
            r6 = r15
            r1.drawRect(r2, r3, r4, r5, r6)
            float r1 = r0.f20238f
            float r1 = r1 - r10
            float r1 = r1 + r17
            r14.translate(r1, r11)
            r3 = 1127481344(0x43340000, float:180.0)
            float r1 = -r8
            r10 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 * r10
            int r2 = r0.f20235c
            float r2 = (float) r2
            float r4 = r1 * r2
            r12 = 1
            r5 = 1
            r1 = r14
            r2 = r20
            r1.drawArc(r2, r3, r4, r5, r6)
            float r1 = r17 * r9
            float r1 = r16 - r1
            r14.translate(r1, r11)
            r3 = 0
            float r8 = r8 * r10
            int r1 = r0.f20235c
            float r1 = (float) r1
            float r4 = r8 * r1
            r1 = r14
            r5 = r12
            r1.drawArc(r2, r3, r4, r5, r6)
            r14.restore()
            return
    }
}
