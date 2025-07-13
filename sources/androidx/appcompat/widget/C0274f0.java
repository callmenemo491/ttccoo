package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.f0 */
/* loaded from: classes.dex */
public class C0274f0 extends android.widget.ListView {

    /* renamed from: a0 */
    public final android.graphics.Rect f1283a0;

    /* renamed from: b0 */
    public int f1284b0;

    /* renamed from: c0 */
    public int f1285c0;

    /* renamed from: d0 */
    public int f1286d0;

    /* renamed from: e0 */
    public int f1287e0;

    /* renamed from: f0 */
    public int f1288f0;

    /* renamed from: g0 */
    public java.lang.reflect.Field f1289g0;

    /* renamed from: h0 */
    public androidx.appcompat.widget.C0274f0.a f1290h0;

    /* renamed from: i0 */
    public boolean f1291i0;

    /* renamed from: j0 */
    public boolean f1292j0;

    /* renamed from: k0 */
    public boolean f1293k0;

    /* renamed from: l0 */
    public p280q0.C5538e f1294l0;

    /* renamed from: m0 */
    public androidx.appcompat.widget.C0274f0.b f1295m0;

    /* renamed from: androidx.appcompat.widget.f0$a */
    public static class a extends p116h.C2433d {

        /* renamed from: Z */
        public boolean f1296Z;

        public a(android.graphics.drawable.Drawable r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 1
                r0.f1296Z = r1
                return
        }

        @Override // p116h.C2433d, android.graphics.drawable.Drawable
        public void draw(android.graphics.Canvas r2) {
                r1 = this;
                boolean r0 = r1.f1296Z
                if (r0 == 0) goto L9
                android.graphics.drawable.Drawable r0 = r1.f10865Y
                r0.draw(r2)
            L9:
                return
        }

        @Override // p116h.C2433d, android.graphics.drawable.Drawable
        public void setHotspot(float r2, float r3) {
                r1 = this;
                boolean r0 = r1.f1296Z
                if (r0 == 0) goto L9
                android.graphics.drawable.Drawable r0 = r1.f10865Y
                r0.setHotspot(r2, r3)
            L9:
                return
        }

        @Override // p116h.C2433d, android.graphics.drawable.Drawable
        public void setHotspotBounds(int r2, int r3, int r4, int r5) {
                r1 = this;
                boolean r0 = r1.f1296Z
                if (r0 == 0) goto L9
                android.graphics.drawable.Drawable r0 = r1.f10865Y
                r0.setHotspotBounds(r2, r3, r4, r5)
            L9:
                return
        }

        @Override // p116h.C2433d, android.graphics.drawable.Drawable
        public boolean setState(int[] r2) {
                r1 = this;
                boolean r0 = r1.f1296Z
                if (r0 == 0) goto Lb
                android.graphics.drawable.Drawable r0 = r1.f10865Y
                boolean r2 = r0.setState(r2)
                return r2
            Lb:
                r2 = 0
                return r2
        }

        @Override // p116h.C2433d, android.graphics.drawable.Drawable
        public boolean setVisible(boolean r2, boolean r3) {
                r1 = this;
                boolean r0 = r1.f1296Z
                if (r0 == 0) goto L9
                boolean r2 = super.setVisible(r2, r3)
                return r2
            L9:
                r2 = 0
                return r2
        }
    }

    /* renamed from: androidx.appcompat.widget.f0$b */
    public class b implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ androidx.appcompat.widget.C0274f0 f1297Y;

        public b(androidx.appcompat.widget.C0274f0 r1) {
                r0 = this;
                r0.f1297Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.appcompat.widget.f0 r0 = r2.f1297Y
                r1 = 0
                r0.f1295m0 = r1
                r0.drawableStateChanged()
                return
        }
    }

    public C0274f0(android.content.Context r3, boolean r4) {
            r2 = this;
            r0 = 0
            r1 = 2130968942(0x7f04016e, float:1.7546552E38)
            r2.<init>(r3, r0, r1)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r2.f1283a0 = r3
            r3 = 0
            r2.f1284b0 = r3
            r2.f1285c0 = r3
            r2.f1286d0 = r3
            r2.f1287e0 = r3
            r2.f1292j0 = r4
            r2.setCacheColorHint(r3)
            java.lang.Class<android.widget.AbsListView> r3 = android.widget.AbsListView.class
            java.lang.String r4 = "mIsChildViewEnabled"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L2b
            r2.f1289g0 = r3     // Catch: java.lang.NoSuchFieldException -> L2b
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.NoSuchFieldException -> L2b
            goto L2f
        L2b:
            r3 = move-exception
            r3.printStackTrace()
        L2f:
            return
    }

    private void setSelectorEnabled(boolean r2) {
            r1 = this;
            androidx.appcompat.widget.f0$a r0 = r1.f1290h0
            if (r0 == 0) goto L6
            r0.f1296Z = r2
        L6:
            return
    }

    /* renamed from: a */
    public int m720a(int r13, int r14, int r15) {
            r12 = this;
            int r0 = r12.getListPaddingTop()
            int r1 = r12.getListPaddingBottom()
            int r2 = r12.getDividerHeight()
            android.graphics.drawable.Drawable r3 = r12.getDivider()
            android.widget.ListAdapter r4 = r12.getAdapter()
            int r0 = r0 + r1
            if (r4 != 0) goto L18
            return r0
        L18:
            r1 = 0
            if (r2 <= 0) goto L1e
            if (r3 == 0) goto L1e
            goto L1f
        L1e:
            r2 = 0
        L1f:
            int r3 = r4.getCount()
            r5 = 0
            r8 = r5
            r6 = 0
            r7 = 0
            r9 = 0
        L28:
            if (r6 >= r3) goto L74
            int r10 = r4.getItemViewType(r6)
            if (r10 == r7) goto L32
            r8 = r5
            r7 = r10
        L32:
            android.view.View r8 = r4.getView(r6, r8, r12)
            android.view.ViewGroup$LayoutParams r10 = r8.getLayoutParams()
            if (r10 != 0) goto L43
            android.view.ViewGroup$LayoutParams r10 = r12.generateDefaultLayoutParams()
            r8.setLayoutParams(r10)
        L43:
            int r10 = r10.height
            if (r10 <= 0) goto L4e
            r11 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            goto L52
        L4e:
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
        L52:
            r8.measure(r13, r10)
            r8.forceLayout()
            if (r6 <= 0) goto L5b
            int r0 = r0 + r2
        L5b:
            int r10 = r8.getMeasuredHeight()
            int r0 = r0 + r10
            if (r0 < r14) goto L6c
            if (r15 < 0) goto L6b
            if (r6 <= r15) goto L6b
            if (r9 <= 0) goto L6b
            if (r0 == r14) goto L6b
            r14 = r9
        L6b:
            return r14
        L6c:
            if (r15 < 0) goto L71
            if (r6 < r15) goto L71
            r9 = r0
        L71:
            int r6 = r6 + 1
            goto L28
        L74:
            return r0
    }

    /* renamed from: b */
    public boolean m721b(android.view.MotionEvent r17, int r18) {
            r16 = this;
            r1 = r16
            r2 = r17
            int r3 = r17.getActionMasked()
            r4 = 0
            r5 = 1
            if (r3 == r5) goto L16
            r0 = 2
            if (r3 == r0) goto L14
            r0 = 3
            if (r3 == r0) goto L1d
            goto L121
        L14:
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            int r6 = r17.findPointerIndex(r18)
            if (r6 >= 0) goto L20
        L1d:
            r0 = 0
            goto L122
        L20:
            float r7 = r2.getX(r6)
            int r7 = (int) r7
            float r6 = r2.getY(r6)
            int r6 = (int) r6
            int r8 = r1.pointToPosition(r7, r6)
            r9 = -1
            if (r8 != r9) goto L33
            goto L123
        L33:
            int r0 = r16.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r10 = r1.getChildAt(r0)
            float r7 = (float) r7
            float r6 = (float) r6
            r1.f1293k0 = r5
            r1.drawableHotspotChanged(r7, r6)
            boolean r0 = r16.isPressed()
            if (r0 != 0) goto L4d
            r1.setPressed(r5)
        L4d:
            r16.layoutChildren()
            int r0 = r1.f1288f0
            if (r0 == r9) goto L6a
            int r11 = r16.getFirstVisiblePosition()
            int r0 = r0 - r11
            android.view.View r0 = r1.getChildAt(r0)
            if (r0 == 0) goto L6a
            if (r0 == r10) goto L6a
            boolean r11 = r0.isPressed()
            if (r11 == 0) goto L6a
            r0.setPressed(r4)
        L6a:
            r1.f1288f0 = r8
            int r0 = r10.getLeft()
            float r0 = (float) r0
            float r0 = r7 - r0
            int r11 = r10.getTop()
            float r11 = (float) r11
            float r11 = r6 - r11
            r10.drawableHotspotChanged(r0, r11)
            boolean r0 = r10.isPressed()
            if (r0 != 0) goto L86
            r10.setPressed(r5)
        L86:
            android.graphics.drawable.Drawable r11 = r16.getSelector()
            if (r11 == 0) goto L90
            if (r8 == r9) goto L90
            r12 = 1
            goto L91
        L90:
            r12 = 0
        L91:
            if (r12 == 0) goto L96
            r11.setVisible(r4, r4)
        L96:
            android.graphics.Rect r0 = r1.f1283a0
            int r13 = r10.getLeft()
            int r14 = r10.getTop()
            int r15 = r10.getRight()
            int r5 = r10.getBottom()
            r0.set(r13, r14, r15, r5)
            int r5 = r0.left
            int r13 = r1.f1284b0
            int r5 = r5 - r13
            r0.left = r5
            int r5 = r0.top
            int r13 = r1.f1285c0
            int r5 = r5 - r13
            r0.top = r5
            int r5 = r0.right
            int r13 = r1.f1286d0
            int r5 = r5 + r13
            r0.right = r5
            int r5 = r0.bottom
            int r13 = r1.f1287e0
            int r5 = r5 + r13
            r0.bottom = r5
            java.lang.reflect.Field r0 = r1.f1289g0     // Catch: java.lang.IllegalAccessException -> Le7
            boolean r0 = r0.getBoolean(r1)     // Catch: java.lang.IllegalAccessException -> Le7
            boolean r5 = r10.isEnabled()     // Catch: java.lang.IllegalAccessException -> Le7
            if (r5 == r0) goto Leb
            java.lang.reflect.Field r5 = r1.f1289g0     // Catch: java.lang.IllegalAccessException -> Le7
            if (r0 != 0) goto Ld9
            r0 = 1
            goto Lda
        Ld9:
            r0 = 0
        Lda:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.IllegalAccessException -> Le7
            r5.set(r1, r0)     // Catch: java.lang.IllegalAccessException -> Le7
            if (r8 == r9) goto Leb
            r16.refreshDrawableState()     // Catch: java.lang.IllegalAccessException -> Le7
            goto Leb
        Le7:
            r0 = move-exception
            r0.printStackTrace()
        Leb:
            if (r12 == 0) goto L106
            android.graphics.Rect r0 = r1.f1283a0
            float r5 = r0.exactCenterX()
            float r0 = r0.exactCenterY()
            int r12 = r16.getVisibility()
            if (r12 != 0) goto Lff
            r12 = 1
            goto L100
        Lff:
            r12 = 0
        L100:
            r11.setVisible(r12, r4)
            r11.setHotspot(r5, r0)
        L106:
            android.graphics.drawable.Drawable r0 = r16.getSelector()
            if (r0 == 0) goto L111
            if (r8 == r9) goto L111
            r0.setHotspot(r7, r6)
        L111:
            r1.setSelectorEnabled(r4)
            r16.refreshDrawableState()
            r5 = 1
            if (r3 != r5) goto L121
            long r5 = r1.getItemIdAtPosition(r8)
            r1.performItemClick(r10, r8, r5)
        L121:
            r0 = 1
        L122:
            r5 = 0
        L123:
            if (r0 == 0) goto L127
            if (r5 == 0) goto L13f
        L127:
            r1.f1293k0 = r4
            r1.setPressed(r4)
            r16.drawableStateChanged()
            int r3 = r1.f1288f0
            int r5 = r16.getFirstVisiblePosition()
            int r3 = r3 - r5
            android.view.View r3 = r1.getChildAt(r3)
            if (r3 == 0) goto L13f
            r3.setPressed(r4)
        L13f:
            if (r0 == 0) goto L157
            q0.e r3 = r1.f1294l0
            if (r3 != 0) goto L14c
            q0.e r3 = new q0.e
            r3.<init>(r1)
            r1.f1294l0 = r3
        L14c:
            q0.e r3 = r1.f1294l0
            boolean r4 = r3.f21555n0
            r4 = 1
            r3.f21555n0 = r4
            r3.onTouch(r1, r2)
            goto L164
        L157:
            q0.e r2 = r1.f1294l0
            if (r2 == 0) goto L164
            boolean r3 = r2.f21555n0
            if (r3 == 0) goto L162
            r2.m11801d()
        L162:
            r2.f21555n0 = r4
        L164:
            return r0
    }

    /* renamed from: c */
    public final void m722c() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.getSelector()
            if (r0 == 0) goto L17
            boolean r1 = r2.f1293k0
            if (r1 == 0) goto L17
            boolean r1 = r2.isPressed()
            if (r1 == 0) goto L17
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L17:
            return
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas r3) {
            r2 = this;
            android.graphics.Rect r0 = r2.f1283a0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L16
            android.graphics.drawable.Drawable r0 = r2.getSelector()
            if (r0 == 0) goto L16
            android.graphics.Rect r1 = r2.f1283a0
            r0.setBounds(r1)
            r0.draw(r3)
        L16:
            super.dispatchDraw(r3)
            return
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
            r1 = this;
            androidx.appcompat.widget.f0$b r0 = r1.f1295m0
            if (r0 == 0) goto L5
            return
        L5:
            super.drawableStateChanged()
            r0 = 1
            r1.setSelectorEnabled(r0)
            r1.m722c()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
            r1 = this;
            boolean r0 = r1.f1292j0
            if (r0 != 0) goto Ld
            boolean r0 = super.hasFocus()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
            r1 = this;
            boolean r0 = r1.f1292j0
            if (r0 != 0) goto Ld
            boolean r0 = super.hasWindowFocus()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    @Override // android.view.View
    public boolean isFocused() {
            r1 = this;
            boolean r0 = r1.f1292j0
            if (r0 != 0) goto Ld
            boolean r0 = super.isFocused()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
            r1 = this;
            boolean r0 = r1.f1292j0
            if (r0 == 0) goto L8
            boolean r0 = r1.f1291i0
            if (r0 != 0) goto Le
        L8:
            boolean r0 = super.isInTouchMode()
            if (r0 == 0) goto L10
        Le:
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            r0 = 0
            r1.f1295m0 = r0
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto Lb
            boolean r5 = super.onHoverEvent(r5)
            return r5
        Lb:
            int r0 = r5.getActionMasked()
            r1 = 10
            if (r0 != r1) goto L21
            androidx.appcompat.widget.f0$b r1 = r4.f1295m0
            if (r1 != 0) goto L21
            androidx.appcompat.widget.f0$b r1 = new androidx.appcompat.widget.f0$b
            r1.<init>(r4)
            r4.f1295m0 = r1
            r4.post(r1)
        L21:
            boolean r1 = super.onHoverEvent(r5)
            r2 = 9
            r3 = -1
            if (r0 == r2) goto L32
            r2 = 7
            if (r0 != r2) goto L2e
            goto L32
        L2e:
            r4.setSelection(r3)
            goto L67
        L32:
            float r0 = r5.getX()
            int r0 = (int) r0
            float r5 = r5.getY()
            int r5 = (int) r5
            int r5 = r4.pointToPosition(r0, r5)
            if (r5 == r3) goto L67
            int r0 = r4.getSelectedItemPosition()
            if (r5 == r0) goto L67
            int r0 = r4.getFirstVisiblePosition()
            int r0 = r5 - r0
            android.view.View r0 = r4.getChildAt(r0)
            boolean r2 = r0.isEnabled()
            if (r2 == 0) goto L64
            int r0 = r0.getTop()
            int r2 = r4.getTop()
            int r0 = r0 - r2
            r4.setSelectionFromTop(r5, r0)
        L64:
            r4.m722c()
        L67:
            return r1
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getAction()
            if (r0 == 0) goto L7
            goto L17
        L7:
            float r0 = r4.getX()
            int r0 = (int) r0
            float r1 = r4.getY()
            int r1 = (int) r1
            int r0 = r3.pointToPosition(r0, r1)
            r3.f1288f0 = r0
        L17:
            androidx.appcompat.widget.f0$b r0 = r3.f1295m0
            if (r0 == 0) goto L23
            androidx.appcompat.widget.f0 r1 = r0.f1297Y
            r2 = 0
            r1.f1295m0 = r2
            r1.removeCallbacks(r0)
        L23:
            boolean r4 = super.onTouchEvent(r4)
            return r4
    }

    public void setListSelectionHidden(boolean r1) {
            r0 = this;
            r0.f1291i0 = r1
            return
    }

    @Override // android.widget.AbsListView
    public void setSelector(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto L8
            androidx.appcompat.widget.f0$a r0 = new androidx.appcompat.widget.f0$a
            r0.<init>(r2)
            goto L9
        L8:
            r0 = 0
        L9:
            r1.f1290h0 = r0
            super.setSelector(r0)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            if (r2 == 0) goto L18
            r2.getPadding(r0)
        L18:
            int r2 = r0.left
            r1.f1284b0 = r2
            int r2 = r0.top
            r1.f1285c0 = r2
            int r2 = r0.right
            r1.f1286d0 = r2
            int r2 = r0.bottom
            r1.f1287e0 = r2
            return
    }
}
