package com.journeyapps.barcodescanner;

/* loaded from: classes.dex */
public class ViewfinderView extends android.view.View {

    /* renamed from: l0 */
    public static final int[] f6671l0 = null;

    /* renamed from: a0 */
    public final android.graphics.Paint f6672a0;

    /* renamed from: b0 */
    public int f6673b0;

    /* renamed from: c0 */
    public final int f6674c0;

    /* renamed from: d0 */
    public final int f6675d0;

    /* renamed from: e0 */
    public boolean f6676e0;

    /* renamed from: f0 */
    public int f6677f0;

    /* renamed from: g0 */
    public java.util.List<sb.C6023q> f6678g0;

    /* renamed from: h0 */
    public java.util.List<sb.C6023q> f6679h0;

    /* renamed from: i0 */
    public com.journeyapps.barcodescanner.C1253a f6680i0;

    /* renamed from: j0 */
    public android.graphics.Rect f6681j0;

    /* renamed from: k0 */
    public p454zc.C7294r f6682k0;

    /* renamed from: com.journeyapps.barcodescanner.ViewfinderView$a */
    public class C1252a implements com.journeyapps.barcodescanner.C1253a.e {

        /* renamed from: a */
        public final /* synthetic */ com.journeyapps.barcodescanner.ViewfinderView f6683a;

        public C1252a(com.journeyapps.barcodescanner.ViewfinderView r1) {
                r0 = this;
                r0.f6683a = r1
                r0.<init>()
                return
        }

        @Override // com.journeyapps.barcodescanner.C1253a.e
        /* renamed from: a */
        public void mo3692a() {
                r1 = this;
                com.journeyapps.barcodescanner.ViewfinderView r0 = r1.f6683a
                r0.m3691a()
                com.journeyapps.barcodescanner.ViewfinderView r0 = r1.f6683a
                r0.invalidate()
                return
        }

        @Override // com.journeyapps.barcodescanner.C1253a.e
        /* renamed from: b */
        public void mo3693b(java.lang.Exception r1) {
                r0 = this;
                return
        }

        @Override // com.journeyapps.barcodescanner.C1253a.e
        /* renamed from: c */
        public void mo3694c() {
                r0 = this;
                return
        }

        @Override // com.journeyapps.barcodescanner.C1253a.e
        /* renamed from: d */
        public void mo3695d() {
                r0 = this;
                return
        }

        @Override // com.journeyapps.barcodescanner.C1253a.e
        /* renamed from: e */
        public void mo3696e() {
                r0 = this;
                return
        }
    }

    static {
            java.lang.Class<com.journeyapps.barcodescanner.ViewfinderView> r0 = com.journeyapps.barcodescanner.ViewfinderView.class
            r0 = 8
            int[] r0 = new int[r0]
            r0 = {x000c: FILL_ARRAY_DATA , data: [0, 64, 128, 192, 255, 192, 128, 64} // fill-array
            com.journeyapps.barcodescanner.ViewfinderView.f6671l0 = r0
            return
    }

    public ViewfinderView(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r3.<init>(r4, r5)
            android.graphics.Paint r4 = new android.graphics.Paint
            r0 = 1
            r4.<init>(r0)
            r3.f6672a0 = r4
            android.content.res.Resources r4 = r3.getResources()
            android.content.Context r1 = r3.getContext()
            int[] r2 = p413xb.C7025h.f27356b
            android.content.res.TypedArray r5 = r1.obtainStyledAttributes(r5, r2)
            r1 = 2131099966(0x7f06013e, float:1.78123E38)
            int r1 = r4.getColor(r1)
            r2 = 4
            int r1 = r5.getColor(r2, r1)
            r3.f6673b0 = r1
            r1 = 2131099962(0x7f06013a, float:1.7812292E38)
            int r1 = r4.getColor(r1)
            r5.getColor(r0, r1)
            r1 = 2131099965(0x7f06013d, float:1.7812298E38)
            int r1 = r4.getColor(r1)
            r2 = 2
            int r1 = r5.getColor(r2, r1)
            r3.f6674c0 = r1
            r1 = 2131099961(0x7f060139, float:1.781229E38)
            int r4 = r4.getColor(r1)
            r1 = 0
            int r4 = r5.getColor(r1, r4)
            r3.f6675d0 = r4
            r4 = 3
            boolean r4 = r5.getBoolean(r4, r0)
            r3.f6676e0 = r4
            r5.recycle()
            r3.f6677f0 = r1
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 20
            r4.<init>(r5)
            r3.f6678g0 = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r5)
            r3.f6679h0 = r4
            return
    }

    /* renamed from: a */
    public void m3691a() {
            r2 = this;
            com.journeyapps.barcodescanner.a r0 = r2.f6680i0
            if (r0 != 0) goto L5
            return
        L5:
            android.graphics.Rect r0 = r0.getFramingRect()
            com.journeyapps.barcodescanner.a r1 = r2.f6680i0
            zc.r r1 = r1.getPreviewSize()
            if (r0 == 0) goto L17
            if (r1 == 0) goto L17
            r2.f6681j0 = r0
            r2.f6682k0 = r1
        L17:
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r12) {
            r11 = this;
            r11.m3691a()
            android.graphics.Rect r7 = r11.f6681j0
            if (r7 == 0) goto L148
            zc.r r8 = r11.f6682k0
            if (r8 != 0) goto Ld
            goto L148
        Ld:
            int r0 = r12.getWidth()
            int r9 = r12.getHeight()
            android.graphics.Paint r1 = r11.f6672a0
            int r2 = r11.f6673b0
            r1.setColor(r2)
            r1 = 0
            r2 = 0
            float r10 = (float) r0
            int r0 = r7.top
            float r4 = (float) r0
            android.graphics.Paint r5 = r11.f6672a0
            r0 = r12
            r3 = r10
            r0.drawRect(r1, r2, r3, r4, r5)
            int r0 = r7.top
            float r2 = (float) r0
            int r0 = r7.left
            float r3 = (float) r0
            int r0 = r7.bottom
            int r0 = r0 + 1
            float r4 = (float) r0
            android.graphics.Paint r5 = r11.f6672a0
            r0 = r12
            r0.drawRect(r1, r2, r3, r4, r5)
            int r0 = r7.right
            int r0 = r0 + 1
            float r1 = (float) r0
            int r0 = r7.top
            float r2 = (float) r0
            int r0 = r7.bottom
            int r0 = r0 + 1
            float r4 = (float) r0
            android.graphics.Paint r5 = r11.f6672a0
            r0 = r12
            r3 = r10
            r0.drawRect(r1, r2, r3, r4, r5)
            r1 = 0
            int r0 = r7.bottom
            int r0 = r0 + 1
            float r2 = (float) r0
            float r4 = (float) r9
            android.graphics.Paint r5 = r11.f6672a0
            r0 = r12
            r0.drawRect(r1, r2, r3, r4, r5)
            boolean r0 = r11.f6676e0
            if (r0 == 0) goto L98
            android.graphics.Paint r0 = r11.f6672a0
            int r1 = r11.f6674c0
            r0.setColor(r1)
            android.graphics.Paint r0 = r11.f6672a0
            int[] r1 = com.journeyapps.barcodescanner.ViewfinderView.f6671l0
            int r2 = r11.f6677f0
            r2 = r1[r2]
            r0.setAlpha(r2)
            int r0 = r11.f6677f0
            int r0 = r0 + 1
            int r1 = r1.length
            int r0 = r0 % r1
            r11.f6677f0 = r0
            int r0 = r7.height()
            int r0 = r0 / 2
            int r1 = r7.top
            int r0 = r0 + r1
            int r1 = r7.left
            int r1 = r1 + 2
            float r1 = (float) r1
            int r2 = r0 + (-1)
            float r2 = (float) r2
            int r3 = r7.right
            int r3 = r3 + (-1)
            float r3 = (float) r3
            int r0 = r0 + 2
            float r4 = (float) r0
            android.graphics.Paint r5 = r11.f6672a0
            r0 = r12
            r0.drawRect(r1, r2, r3, r4, r5)
        L98:
            int r0 = r11.getWidth()
            float r0 = (float) r0
            int r1 = r8.f27963Y
            float r1 = (float) r1
            float r0 = r0 / r1
            int r1 = r11.getHeight()
            float r1 = (float) r1
            int r2 = r8.f27964Z
            float r2 = (float) r2
            float r1 = r1 / r2
            java.util.List<sb.q> r2 = r11.f6679h0
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Leb
            android.graphics.Paint r2 = r11.f6672a0
            r3 = 80
            r2.setAlpha(r3)
            android.graphics.Paint r2 = r11.f6672a0
            int r3 = r11.f6675d0
            r2.setColor(r3)
            r2 = 1077936128(0x40400000, float:3.0)
            java.util.List<sb.q> r3 = r11.f6679h0
            java.util.Iterator r3 = r3.iterator()
        Lc8:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Le6
            java.lang.Object r4 = r3.next()
            sb.q r4 = (sb.C6023q) r4
            float r5 = r4.f23222a
            float r5 = r5 * r0
            int r5 = (int) r5
            float r5 = (float) r5
            float r4 = r4.f23223b
            float r4 = r4 * r1
            int r4 = (int) r4
            float r4 = (float) r4
            android.graphics.Paint r8 = r11.f6672a0
            r12.drawCircle(r5, r4, r2, r8)
            goto Lc8
        Le6:
            java.util.List<sb.q> r2 = r11.f6679h0
            r2.clear()
        Leb:
            java.util.List<sb.q> r2 = r11.f6678g0
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L132
            android.graphics.Paint r2 = r11.f6672a0
            r3 = 160(0xa0, float:2.24E-43)
            r2.setAlpha(r3)
            android.graphics.Paint r2 = r11.f6672a0
            int r3 = r11.f6675d0
            r2.setColor(r3)
            java.util.List<sb.q> r2 = r11.f6678g0
            java.util.Iterator r2 = r2.iterator()
        L107:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L127
            java.lang.Object r3 = r2.next()
            sb.q r3 = (sb.C6023q) r3
            float r4 = r3.f23222a
            float r4 = r4 * r0
            int r4 = (int) r4
            float r4 = (float) r4
            float r3 = r3.f23223b
            float r3 = r3 * r1
            int r3 = (int) r3
            float r3 = (float) r3
            r5 = 1086324736(0x40c00000, float:6.0)
            android.graphics.Paint r8 = r11.f6672a0
            r12.drawCircle(r4, r3, r5, r8)
            goto L107
        L127:
            java.util.List<sb.q> r0 = r11.f6678g0
            java.util.List<sb.q> r1 = r11.f6679h0
            r11.f6678g0 = r1
            r11.f6679h0 = r0
            r1.clear()
        L132:
            r1 = 80
            int r0 = r7.left
            int r3 = r0 + (-6)
            int r0 = r7.top
            int r4 = r0 + (-6)
            int r0 = r7.right
            int r5 = r0 + 6
            int r0 = r7.bottom
            int r6 = r0 + 6
            r0 = r11
            r0.postInvalidateDelayed(r1, r3, r4, r5, r6)
        L148:
            return
    }

    public void setCameraPreview(com.journeyapps.barcodescanner.C1253a r2) {
            r1 = this;
            r1.f6680i0 = r2
            com.journeyapps.barcodescanner.ViewfinderView$a r0 = new com.journeyapps.barcodescanner.ViewfinderView$a
            r0.<init>(r1)
            java.util.List<com.journeyapps.barcodescanner.a$e> r2 = r2.f6694j0
            r2.add(r0)
            return
    }

    public void setLaserVisibility(boolean r1) {
            r0 = this;
            r0.f6676e0 = r1
            return
    }

    public void setMaskColor(int r1) {
            r0 = this;
            r0.f6673b0 = r1
            return
    }
}
