package androidx.cardview.widget;

/* loaded from: classes.dex */
public class CardView extends android.widget.FrameLayout {

    /* renamed from: h0 */
    public static final int[] f1510h0 = null;

    /* renamed from: i0 */
    public static final p299r.InterfaceC5755c f1511i0 = null;

    /* renamed from: a0 */
    public boolean f1512a0;

    /* renamed from: b0 */
    public boolean f1513b0;

    /* renamed from: c0 */
    public int f1514c0;

    /* renamed from: d0 */
    public int f1515d0;

    /* renamed from: e0 */
    public final android.graphics.Rect f1516e0;

    /* renamed from: f0 */
    public final android.graphics.Rect f1517f0;

    /* renamed from: g0 */
    public final p299r.InterfaceC5754b f1518g0;

    /* renamed from: androidx.cardview.widget.CardView$a */
    public class C0317a implements p299r.InterfaceC5754b {

        /* renamed from: a */
        public android.graphics.drawable.Drawable f1519a;

        /* renamed from: b */
        public final /* synthetic */ androidx.cardview.widget.CardView f1520b;

        public C0317a(androidx.cardview.widget.CardView r1) {
                r0 = this;
                r0.f1520b = r1
                r0.<init>()
                return
        }

        /* renamed from: a */
        public boolean m866a() {
                r1 = this;
                androidx.cardview.widget.CardView r0 = r1.f1520b
                boolean r0 = r0.getPreventCornerOverlap()
                return r0
        }

        /* renamed from: b */
        public void m867b(int r4, int r5, int r6, int r7) {
                r3 = this;
                androidx.cardview.widget.CardView r0 = r3.f1520b
                android.graphics.Rect r0 = r0.f1517f0
                r0.set(r4, r5, r6, r7)
                androidx.cardview.widget.CardView r0 = r3.f1520b
                android.graphics.Rect r1 = r0.f1516e0
                int r2 = r1.left
                int r4 = r4 + r2
                int r2 = r1.top
                int r5 = r5 + r2
                int r2 = r1.right
                int r6 = r6 + r2
                int r1 = r1.bottom
                int r7 = r7 + r1
                androidx.cardview.widget.CardView.m865c(r0, r4, r5, r6, r7)
                return
        }
    }

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r0[r1] = r2
            androidx.cardview.widget.CardView.f1510h0 = r0
            r.a r0 = new r.a
            r0.<init>()
            androidx.cardview.widget.CardView.f1511i0 = r0
            return
    }

    public CardView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 2130968717(0x7f04008d, float:1.7546096E38)
            r1.<init>(r2, r3, r0)
            return
    }

    public CardView(android.content.Context r9, android.util.AttributeSet r10, int r11) {
            r8 = this;
            r8.<init>(r9, r10, r11)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.f1516e0 = r0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r8.f1517f0 = r1
            androidx.cardview.widget.CardView$a r1 = new androidx.cardview.widget.CardView$a
            r1.<init>(r8)
            r8.f1518g0 = r1
            int[] r2 = p279q.C5533a.f21538a
            r3 = 2132017397(0x7f1400f5, float:1.9673071E38)
            android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r10, r2, r11, r3)
            r10 = 2
            boolean r11 = r9.hasValue(r10)
            r2 = 3
            r3 = 0
            if (r11 == 0) goto L2f
            android.content.res.ColorStateList r10 = r9.getColorStateList(r10)
            goto L64
        L2f:
            android.content.Context r11 = r8.getContext()
            int[] r4 = androidx.cardview.widget.CardView.f1510h0
            android.content.res.TypedArray r11 = r11.obtainStyledAttributes(r4)
            int r4 = r11.getColor(r3, r3)
            r11.recycle()
            float[] r11 = new float[r2]
            android.graphics.Color.colorToHSV(r4, r11)
            r10 = r11[r10]
            r11 = 1056964608(0x3f000000, float:0.5)
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L55
            android.content.res.Resources r10 = r8.getResources()
            r11 = 2131099697(0x7f060031, float:1.7811755E38)
            goto L5c
        L55:
            android.content.res.Resources r10 = r8.getResources()
            r11 = 2131099696(0x7f060030, float:1.7811752E38)
        L5c:
            int r10 = r10.getColor(r11)
            android.content.res.ColorStateList r10 = android.content.res.ColorStateList.valueOf(r10)
        L64:
            r11 = 0
            float r2 = r9.getDimension(r2, r11)
            r4 = 4
            float r4 = r9.getDimension(r4, r11)
            r5 = 5
            float r11 = r9.getDimension(r5, r11)
            r5 = 7
            boolean r5 = r9.getBoolean(r5, r3)
            r8.f1512a0 = r5
            r5 = 6
            r6 = 1
            boolean r5 = r9.getBoolean(r5, r6)
            r8.f1513b0 = r5
            r5 = 8
            int r5 = r9.getDimensionPixelSize(r5, r3)
            r7 = 10
            int r7 = r9.getDimensionPixelSize(r7, r5)
            r0.left = r7
            r7 = 12
            int r7 = r9.getDimensionPixelSize(r7, r5)
            r0.top = r7
            r7 = 11
            int r7 = r9.getDimensionPixelSize(r7, r5)
            r0.right = r7
            r7 = 9
            int r5 = r9.getDimensionPixelSize(r7, r5)
            r0.bottom = r5
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 <= 0) goto Lad
            r11 = r4
        Lad:
            int r0 = r9.getDimensionPixelSize(r3, r3)
            r8.f1514c0 = r0
            int r0 = r9.getDimensionPixelSize(r6, r3)
            r8.f1515d0 = r0
            r9.recycle()
            r.c r9 = androidx.cardview.widget.CardView.f1511i0
            r.a r9 = (p299r.C5753a) r9
            r.d r0 = new r.d
            r0.<init>(r10, r2)
            r10 = r1
            androidx.cardview.widget.CardView$a r10 = (androidx.cardview.widget.CardView.C0317a) r10
            r10.f1519a = r0
            androidx.cardview.widget.CardView r2 = r10.f1520b
            r2.setBackgroundDrawable(r0)
            androidx.cardview.widget.CardView r10 = r10.f1520b
            r10.setClipToOutline(r6)
            r10.setElevation(r4)
            r9.m12070d(r1, r11)
            return
    }

    /* renamed from: c */
    public static /* synthetic */ void m865c(androidx.cardview.widget.CardView r0, int r1, int r2, int r3, int r4) {
            super.setPadding(r1, r2, r3, r4)
            return
    }

    public android.content.res.ColorStateList getCardBackgroundColor() {
            r2 = this;
            r.c r0 = androidx.cardview.widget.CardView.f1511i0
            r.b r1 = r2.f1518g0
            r.a r0 = (p299r.C5753a) r0
            r.d r0 = r0.m12067a(r1)
            android.content.res.ColorStateList r0 = r0.f22162h
            return r0
    }

    public float getCardElevation() {
            r1 = this;
            r.b r0 = r1.f1518g0
            androidx.cardview.widget.CardView$a r0 = (androidx.cardview.widget.CardView.C0317a) r0
            androidx.cardview.widget.CardView r0 = r0.f1520b
            float r0 = r0.getElevation()
            return r0
    }

    public int getContentPaddingBottom() {
            r1 = this;
            android.graphics.Rect r0 = r1.f1516e0
            int r0 = r0.bottom
            return r0
    }

    public int getContentPaddingLeft() {
            r1 = this;
            android.graphics.Rect r0 = r1.f1516e0
            int r0 = r0.left
            return r0
    }

    public int getContentPaddingRight() {
            r1 = this;
            android.graphics.Rect r0 = r1.f1516e0
            int r0 = r0.right
            return r0
    }

    public int getContentPaddingTop() {
            r1 = this;
            android.graphics.Rect r0 = r1.f1516e0
            int r0 = r0.top
            return r0
    }

    public float getMaxCardElevation() {
            r2 = this;
            r.c r0 = androidx.cardview.widget.CardView.f1511i0
            r.b r1 = r2.f1518g0
            r.a r0 = (p299r.C5753a) r0
            float r0 = r0.m12068b(r1)
            return r0
    }

    public boolean getPreventCornerOverlap() {
            r1 = this;
            boolean r0 = r1.f1513b0
            return r0
    }

    public float getRadius() {
            r2 = this;
            r.c r0 = androidx.cardview.widget.CardView.f1511i0
            r.b r1 = r2.f1518g0
            r.a r0 = (p299r.C5753a) r0
            float r0 = r0.m12069c(r1)
            return r0
    }

    public boolean getUseCompatPadding() {
            r1 = this;
            boolean r0 = r1.f1512a0
            return r0
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int r1, int r2) {
            r0 = this;
            super.onMeasure(r1, r2)
            return
    }

    public void setCardBackgroundColor(int r3) {
            r2 = this;
            r.c r0 = androidx.cardview.widget.CardView.f1511i0
            r.b r1 = r2.f1518g0
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r3)
            r.a r0 = (p299r.C5753a) r0
            r.d r0 = r0.m12067a(r1)
            r0.m12073b(r3)
            r0.invalidateSelf()
            return
    }

    public void setCardBackgroundColor(android.content.res.ColorStateList r3) {
            r2 = this;
            r.c r0 = androidx.cardview.widget.CardView.f1511i0
            r.b r1 = r2.f1518g0
            r.a r0 = (p299r.C5753a) r0
            r.d r0 = r0.m12067a(r1)
            r0.m12073b(r3)
            r0.invalidateSelf()
            return
    }

    public void setCardElevation(float r2) {
            r1 = this;
            r.b r0 = r1.f1518g0
            androidx.cardview.widget.CardView$a r0 = (androidx.cardview.widget.CardView.C0317a) r0
            androidx.cardview.widget.CardView r0 = r0.f1520b
            r0.setElevation(r2)
            return
    }

    public void setMaxCardElevation(float r3) {
            r2 = this;
            r.c r0 = androidx.cardview.widget.CardView.f1511i0
            r.b r1 = r2.f1518g0
            r.a r0 = (p299r.C5753a) r0
            r0.m12070d(r1, r3)
            return
    }

    @Override // android.view.View
    public void setMinimumHeight(int r1) {
            r0 = this;
            r0.f1515d0 = r1
            super.setMinimumHeight(r1)
            return
    }

    @Override // android.view.View
    public void setMinimumWidth(int r1) {
            r0 = this;
            r0.f1514c0 = r1
            super.setMinimumWidth(r1)
            return
    }

    @Override // android.view.View
    public void setPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public void setPaddingRelative(int r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    public void setPreventCornerOverlap(boolean r3) {
            r2 = this;
            boolean r0 = r2.f1513b0
            if (r3 == r0) goto L15
            r2.f1513b0 = r3
            r.c r3 = androidx.cardview.widget.CardView.f1511i0
            r.b r0 = r2.f1518g0
            r.a r3 = (p299r.C5753a) r3
            r.d r1 = r3.m12067a(r0)
            float r1 = r1.f22159e
            r3.m12070d(r0, r1)
        L15:
            return
    }

    public void setRadius(float r3) {
            r2 = this;
            r.c r0 = androidx.cardview.widget.CardView.f1511i0
            r.b r1 = r2.f1518g0
            r.a r0 = (p299r.C5753a) r0
            r.d r0 = r0.m12067a(r1)
            float r1 = r0.f22155a
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L11
            goto L1a
        L11:
            r0.f22155a = r3
            r3 = 0
            r0.m12074c(r3)
            r0.invalidateSelf()
        L1a:
            return
    }

    public void setUseCompatPadding(boolean r3) {
            r2 = this;
            boolean r0 = r2.f1512a0
            if (r0 == r3) goto L15
            r2.f1512a0 = r3
            r.c r3 = androidx.cardview.widget.CardView.f1511i0
            r.b r0 = r2.f1518g0
            r.a r3 = (p299r.C5753a) r3
            r.d r1 = r3.m12067a(r0)
            float r1 = r1.f22159e
            r3.m12070d(r0, r1)
        L15:
            return
    }
}
