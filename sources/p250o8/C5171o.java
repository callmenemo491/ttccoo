package p250o8;

/* renamed from: o8.o */
/* loaded from: classes.dex */
public final class C5171o extends p250o8.AbstractC5169m<p250o8.C5176t> {

    /* renamed from: c */
    public float f20280c;

    /* renamed from: d */
    public float f20281d;

    /* renamed from: e */
    public float f20282e;

    public C5171o(p250o8.C5176t r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1133903872(0x43960000, float:300.0)
            r0.f20280c = r1
            return
    }

    /* renamed from: f */
    public static void m11490f(android.graphics.Canvas r11, android.graphics.Paint r12, float r13, float r14, float r15, boolean r16, android.graphics.RectF r17) {
            r6 = r11
            r0 = r13
            r1 = r14
            r11.save()
            r7 = 0
            r2 = r15
            r11.translate(r15, r7)
            if (r16 != 0) goto L12
            r2 = 1127481344(0x43340000, float:180.0)
            r11.rotate(r2)
        L12:
            float r2 = -r1
            float r3 = -r0
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r8 = r3 + r1
            r3 = 0
            float r0 = r0 / r4
            float r9 = r0 - r1
            r0 = r11
            r1 = r2
            r2 = r8
            r4 = r9
            r5 = r12
            r0.drawRect(r1, r2, r3, r4, r5)
            r11.save()
            r11.translate(r7, r8)
            r8 = 1127481344(0x43340000, float:180.0)
            r3 = 1119092736(0x42b40000, float:90.0)
            r10 = 1
            r2 = 1127481344(0x43340000, float:180.0)
            r4 = 1
            r1 = r17
            r0.drawArc(r1, r2, r3, r4, r5)
            r11.restore()
            r11.translate(r7, r9)
            r3 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r2 = r8
            r4 = r10
            r0.drawArc(r1, r2, r3, r4, r5)
            r11.restore()
            return
    }

    @Override // p250o8.AbstractC5169m
    /* renamed from: a */
    public void mo11471a(android.graphics.Canvas r8, float r9) {
            r7 = this;
            android.graphics.Rect r0 = r8.getClipBounds()
            int r1 = r0.width()
            float r1 = (float) r1
            r7.f20280c = r1
            S extends o8.c r1 = r7.f20276a
            o8.t r1 = (p250o8.C5176t) r1
            int r1 = r1.f20229a
            float r1 = (float) r1
            int r2 = r0.left
            float r2 = (float) r2
            int r3 = r0.width()
            float r3 = (float) r3
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r3 = r3 + r2
            int r2 = r0.top
            float r2 = (float) r2
            int r5 = r0.height()
            float r5 = (float) r5
            float r5 = r5 / r4
            float r5 = r5 + r2
            int r0 = r0.height()
            S extends o8.c r2 = r7.f20276a
            o8.t r2 = (p250o8.C5176t) r2
            int r2 = r2.f20229a
            int r0 = r0 - r2
            float r0 = (float) r0
            float r0 = r0 / r4
            r2 = 0
            float r0 = java.lang.Math.max(r2, r0)
            float r0 = r0 + r5
            r8.translate(r3, r0)
            S extends o8.c r0 = r7.f20276a
            o8.t r0 = (p250o8.C5176t) r0
            boolean r0 = r0.f20305i
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L4d
            r8.scale(r3, r5)
        L4d:
            o8.l r0 = r7.f20277b
            boolean r0 = r0.m11486f()
            if (r0 == 0) goto L5e
            S extends o8.c r0 = r7.f20276a
            o8.t r0 = (p250o8.C5176t) r0
            int r0 = r0.f20233e
            r6 = 1
            if (r0 == r6) goto L6f
        L5e:
            o8.l r0 = r7.f20277b
            boolean r0 = r0.m11485e()
            if (r0 == 0) goto L72
            S extends o8.c r0 = r7.f20276a
            o8.t r0 = (p250o8.C5176t) r0
            int r0 = r0.f20234f
            r6 = 2
            if (r0 != r6) goto L72
        L6f:
            r8.scale(r5, r3)
        L72:
            o8.l r0 = r7.f20277b
            boolean r0 = r0.m11486f()
            if (r0 != 0) goto L82
            o8.l r0 = r7.f20277b
            boolean r0 = r0.m11485e()
            if (r0 == 0) goto L91
        L82:
            S extends o8.c r0 = r7.f20276a
            o8.t r0 = (p250o8.C5176t) r0
            int r0 = r0.f20229a
            float r0 = (float) r0
            float r3 = r9 - r5
            float r3 = r3 * r0
            float r3 = r3 / r4
            r8.translate(r2, r3)
        L91:
            float r0 = r7.f20280c
            float r2 = -r0
            float r2 = r2 / r4
            float r3 = -r1
            float r3 = r3 / r4
            float r0 = r0 / r4
            float r1 = r1 / r4
            r8.clipRect(r2, r3, r0, r1)
            S extends o8.c r8 = r7.f20276a
            r0 = r8
            o8.t r0 = (p250o8.C5176t) r0
            int r0 = r0.f20229a
            float r0 = (float) r0
            float r0 = r0 * r9
            r7.f20281d = r0
            o8.t r8 = (p250o8.C5176t) r8
            int r8 = r8.f20230b
            float r8 = (float) r8
            float r8 = r8 * r9
            r7.f20282e = r8
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
            float r0 = r10.f20280c
            float r1 = -r0
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r3 = r10.f20282e
            float r1 = r1 + r3
            float r3 = r3 * r2
            float r0 = r0 - r3
            float r13 = r13 * r0
            float r13 = r13 + r1
            float r0 = r0 * r14
            float r14 = r0 + r1
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r12.setStyle(r0)
            r0 = 1
            r12.setAntiAlias(r0)
            r12.setColor(r15)
            float r15 = r10.f20281d
            float r0 = -r15
            float r5 = r0 / r2
            float r7 = r15 / r2
            r3 = r11
            r4 = r13
            r6 = r14
            r8 = r12
            r3.drawRect(r4, r5, r6, r7, r8)
            android.graphics.RectF r15 = new android.graphics.RectF
            float r0 = r10.f20282e
            float r1 = -r0
            r15.<init>(r1, r1, r0, r0)
            float r5 = r10.f20281d
            float r6 = r10.f20282e
            r8 = 1
            r4 = r12
            r7 = r13
            r9 = r15
            m11490f(r3, r4, r5, r6, r7, r8, r9)
            float r5 = r10.f20281d
            float r6 = r10.f20282e
            r8 = 0
            r7 = r14
            m11490f(r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @Override // p250o8.AbstractC5169m
    /* renamed from: c */
    public void mo11473c(android.graphics.Canvas r13, android.graphics.Paint r14) {
            r12 = this;
            S extends o8.c r0 = r12.f20276a
            o8.t r0 = (p250o8.C5176t) r0
            int r0 = r0.f20232d
            o8.l r1 = r12.f20277b
            int r1 = r1.f20275h0
            int r0 = p124h7.C2939x3.m7284j(r0, r1)
            float r1 = r12.f20280c
            float r1 = -r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r3 = r12.f20282e
            float r1 = r1 + r3
            float r11 = -r1
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r14.setStyle(r3)
            r3 = 1
            r14.setAntiAlias(r3)
            r14.setColor(r0)
            float r0 = r12.f20281d
            float r3 = -r0
            float r6 = r3 / r2
            float r8 = r0 / r2
            r4 = r13
            r5 = r1
            r7 = r11
            r9 = r14
            r4.drawRect(r5, r6, r7, r8, r9)
            android.graphics.RectF r0 = new android.graphics.RectF
            float r2 = r12.f20282e
            float r3 = -r2
            r0.<init>(r3, r3, r2, r2)
            float r6 = r12.f20281d
            float r7 = r12.f20282e
            r9 = 1
            r5 = r14
            r8 = r1
            r10 = r0
            m11490f(r4, r5, r6, r7, r8, r9, r10)
            float r5 = r12.f20281d
            float r6 = r12.f20282e
            r8 = 0
            r3 = r13
            r4 = r14
            r7 = r11
            r9 = r0
            m11490f(r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @Override // p250o8.AbstractC5169m
    /* renamed from: d */
    public int mo11474d() {
            r1 = this;
            S extends o8.c r0 = r1.f20276a
            o8.t r0 = (p250o8.C5176t) r0
            int r0 = r0.f20229a
            return r0
    }

    @Override // p250o8.AbstractC5169m
    /* renamed from: e */
    public int mo11475e() {
            r1 = this;
            r0 = -1
            return r0
    }
}
