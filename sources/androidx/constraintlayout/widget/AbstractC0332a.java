package androidx.constraintlayout.widget;

/* renamed from: androidx.constraintlayout.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractC0332a extends android.view.View {

    /* renamed from: a0 */
    public int[] f1778a0;

    /* renamed from: b0 */
    public int f1779b0;

    /* renamed from: c0 */
    public android.content.Context f1780c0;

    /* renamed from: d0 */
    public p381w.InterfaceC6769j f1781d0;

    /* renamed from: e0 */
    public java.lang.String f1782e0;

    /* renamed from: f0 */
    public java.lang.String f1783f0;

    /* renamed from: g0 */
    public android.view.View[] f1784g0;

    /* renamed from: h0 */
    public java.util.HashMap<java.lang.Integer, java.lang.String> f1785h0;

    public AbstractC0332a(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            r0 = 32
            int[] r0 = new int[r0]
            r2.f1778a0 = r0
            r0 = 0
            r2.f1784g0 = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.f1785h0 = r1
            r2.f1780c0 = r3
            r2.mo900k(r0)
            return
    }

    public AbstractC0332a(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r0 = 32
            int[] r0 = new int[r0]
            r1.f1778a0 = r0
            r0 = 0
            r1.f1784g0 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f1785h0 = r0
            r1.f1780c0 = r2
            r1.mo900k(r3)
            return
    }

    /* renamed from: e */
    public final void m935e(java.lang.String r4) {
            r3 = this;
            if (r4 == 0) goto L4e
            int r0 = r4.length()
            if (r0 != 0) goto L9
            goto L4e
        L9:
            android.content.Context r0 = r3.f1780c0
            if (r0 != 0) goto Le
            return
        Le:
            java.lang.String r4 = r4.trim()
            android.view.ViewParent r0 = r3.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r0 == 0) goto L20
            android.view.ViewParent r0 = r3.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
        L20:
            int r0 = r3.m940j(r4)
            if (r0 == 0) goto L33
            java.util.HashMap<java.lang.Integer, java.lang.String> r1 = r3.f1785h0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1.put(r2, r4)
            r3.m936f(r0)
            goto L4e
        L33:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Could not find id of \""
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = "\""
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r4)
        L4e:
            return
    }

    /* renamed from: f */
    public final void m936f(int r4) {
            r3 = this;
            int r0 = r3.getId()
            if (r4 != r0) goto L7
            return
        L7:
            int r0 = r3.f1779b0
            int r0 = r0 + 1
            int[] r1 = r3.f1778a0
            int r2 = r1.length
            if (r0 <= r2) goto L19
            int r0 = r1.length
            int r0 = r0 * 2
            int[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.f1778a0 = r0
        L19:
            int[] r0 = r3.f1778a0
            int r1 = r3.f1779b0
            r0[r1] = r4
            int r1 = r1 + 1
            r3.f1779b0 = r1
            return
    }

    /* renamed from: g */
    public final void m937g(java.lang.String r8) {
            r7 = this;
            if (r8 == 0) goto L77
            int r0 = r8.length()
            if (r0 != 0) goto L9
            goto L77
        L9:
            android.content.Context r0 = r7.f1780c0
            if (r0 != 0) goto Le
            return
        Le:
            java.lang.String r8 = r8.trim()
            r0 = 0
            android.view.ViewParent r1 = r7.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L21
            android.view.ViewParent r0 = r7.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
        L21:
            java.lang.String r1 = "ConstraintHelper"
            if (r0 != 0) goto L2b
            java.lang.String r8 = "Parent not a ConstraintLayout"
            android.util.Log.w(r1, r8)
            return
        L2b:
            int r2 = r0.getChildCount()
            r3 = 0
        L30:
            if (r3 >= r2) goto L77
            android.view.View r4 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            boolean r6 = r5 instanceof androidx.constraintlayout.widget.ConstraintLayout.C0330a
            if (r6 == 0) goto L74
            androidx.constraintlayout.widget.ConstraintLayout$a r5 = (androidx.constraintlayout.widget.ConstraintLayout.C0330a) r5
            java.lang.String r5 = r5.f1725U
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L74
            int r5 = r4.getId()
            r6 = -1
            if (r5 != r6) goto L6d
            java.lang.String r5 = "to use ConstraintTag view "
            java.lang.StringBuilder r5 = android.support.v4.media.C0144c.m256a(r5)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r5.append(r4)
            java.lang.String r4 = " must have an ID"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.util.Log.w(r1, r4)
            goto L74
        L6d:
            int r4 = r4.getId()
            r7.m936f(r4)
        L74:
            int r3 = r3 + 1
            goto L30
        L77:
            return
    }

    public int[] getReferencedIds() {
            r2 = this;
            int[] r0 = r2.f1778a0
            int r1 = r2.f1779b0
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
    }

    /* renamed from: h */
    public void m938h() {
            r6 = this;
            android.view.ViewParent r0 = r6.getParent()
            if (r0 == 0) goto L36
            boolean r1 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L36
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            int r1 = r6.getVisibility()
            float r2 = r6.getElevation()
            r3 = 0
        L15:
            int r4 = r6.f1779b0
            if (r3 >= r4) goto L36
            int[] r4 = r6.f1778a0
            r4 = r4[r3]
            android.view.View r4 = r0.m925f(r4)
            if (r4 == 0) goto L33
            r4.setVisibility(r1)
            r5 = 0
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 <= 0) goto L33
            float r5 = r4.getTranslationZ()
            float r5 = r5 + r2
            r4.setTranslationZ(r5)
        L33:
            int r3 = r3 + 1
            goto L15
        L36:
            return
    }

    /* renamed from: i */
    public final int m939i(androidx.constraintlayout.widget.ConstraintLayout r8, java.lang.String r9) {
            r7 = this;
            r0 = 0
            if (r9 == 0) goto L37
            android.content.Context r1 = r7.f1780c0
            android.content.res.Resources r1 = r1.getResources()
            if (r1 != 0) goto Lc
            return r0
        Lc:
            int r2 = r8.getChildCount()
            r3 = 0
        L11:
            if (r3 >= r2) goto L37
            android.view.View r4 = r8.getChildAt(r3)
            int r5 = r4.getId()
            r6 = -1
            if (r5 == r6) goto L34
            r5 = 0
            int r6 = r4.getId()     // Catch: android.content.res.Resources.NotFoundException -> L28
            java.lang.String r5 = r1.getResourceEntryName(r6)     // Catch: android.content.res.Resources.NotFoundException -> L28
            goto L29
        L28:
        L29:
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L34
            int r8 = r4.getId()
            return r8
        L34:
            int r3 = r3 + 1
            goto L11
        L37:
            return r0
    }

    /* renamed from: j */
    public final int m940j(java.lang.String r6) {
            r5 = this;
            android.view.ViewParent r0 = r5.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r1 = 0
            if (r0 == 0) goto L10
            android.view.ViewParent r0 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            goto L11
        L10:
            r0 = r1
        L11:
            boolean r2 = r5.isInEditMode()
            r3 = 0
            if (r2 == 0) goto L28
            if (r0 == 0) goto L28
            java.lang.Object r2 = r0.m924e(r3, r6)
            boolean r4 = r2 instanceof java.lang.Integer
            if (r4 == 0) goto L28
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r3 = r2.intValue()
        L28:
            if (r3 != 0) goto L30
            if (r0 == 0) goto L30
            int r3 = r5.m939i(r0, r6)
        L30:
            if (r3 != 0) goto L3e
            java.lang.Class<y.e> r0 = p422y.C7095e.class
            java.lang.reflect.Field r0 = r0.getField(r6)     // Catch: java.lang.Exception -> L3d
            int r3 = r0.getInt(r1)     // Catch: java.lang.Exception -> L3d
            goto L3e
        L3d:
        L3e:
            if (r3 != 0) goto L52
            android.content.Context r0 = r5.f1780c0
            android.content.res.Resources r0 = r0.getResources()
            android.content.Context r1 = r5.f1780c0
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r2 = "id"
            int r3 = r0.getIdentifier(r6, r2, r1)
        L52:
            return r3
    }

    /* renamed from: k */
    public void mo900k(android.util.AttributeSet r5) {
            r4 = this;
            if (r5 == 0) goto L38
            android.content.Context r0 = r4.getContext()
            int[] r1 = p422y.C7096f.f27456b
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r1)
            int r0 = r5.getIndexCount()
            r1 = 0
        L11:
            if (r1 >= r0) goto L35
            int r2 = r5.getIndex(r1)
            r3 = 19
            if (r2 != r3) goto L25
            java.lang.String r2 = r5.getString(r2)
            r4.f1782e0 = r2
            r4.setIds(r2)
            goto L32
        L25:
            r3 = 20
            if (r2 != r3) goto L32
            java.lang.String r2 = r5.getString(r2)
            r4.f1783f0 = r2
            r4.setReferenceTags(r2)
        L32:
            int r1 = r1 + 1
            goto L11
        L35:
            r5.recycle()
        L38:
            return
    }

    /* renamed from: l */
    public void mo919l(androidx.constraintlayout.widget.C0333b.a r8, p381w.C6770k r9, androidx.constraintlayout.widget.ConstraintLayout.C0330a r10, android.util.SparseArray<p381w.C6765f> r11) {
            r7 = this;
            androidx.constraintlayout.widget.b$b r10 = r8.f1794d
            int[] r0 = r10.f1833e0
            r1 = 0
            if (r0 == 0) goto Lb
            r7.setReferencedIds(r0)
            goto L47
        Lb:
            java.lang.String r10 = r10.f1835f0
            if (r10 == 0) goto L47
            int r10 = r10.length()
            if (r10 <= 0) goto L47
            androidx.constraintlayout.widget.b$b r10 = r8.f1794d
            java.lang.String r0 = r10.f1835f0
            java.lang.String r2 = ","
            java.lang.String[] r0 = r0.split(r2)
            r7.getContext()
            int r2 = r0.length
            int[] r2 = new int[r2]
            r3 = 0
            r4 = 0
        L27:
            int r5 = r0.length
            if (r3 >= r5) goto L3e
            r5 = r0[r3]
            java.lang.String r5 = r5.trim()
            int r5 = r7.m940j(r5)
            if (r5 == 0) goto L3b
            int r6 = r4 + 1
            r2[r4] = r5
            r4 = r6
        L3b:
            int r3 = r3 + 1
            goto L27
        L3e:
            int r0 = r0.length
            if (r4 == r0) goto L45
            int[] r2 = java.util.Arrays.copyOf(r2, r4)
        L45:
            r10.f1833e0 = r2
        L47:
            r9.mo13742b()
            androidx.constraintlayout.widget.b$b r10 = r8.f1794d
            int[] r10 = r10.f1833e0
            if (r10 == 0) goto L67
        L50:
            androidx.constraintlayout.widget.b$b r10 = r8.f1794d
            int[] r10 = r10.f1833e0
            int r0 = r10.length
            if (r1 >= r0) goto L67
            r10 = r10[r1]
            java.lang.Object r10 = r11.get(r10)
            w.f r10 = (p381w.C6765f) r10
            if (r10 == 0) goto L64
            r9.mo13743c(r10)
        L64:
            int r1 = r1 + 1
            goto L50
        L67:
            return
    }

    /* renamed from: m */
    public void mo920m(p381w.C6765f r1, boolean r2) {
            r0 = this;
            return
    }

    /* renamed from: n */
    public void m941n() {
            r2 = this;
            w.j r0 = r2.f1781d0
            if (r0 != 0) goto L5
            return
        L5:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            boolean r1 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout.C0330a
            if (r1 == 0) goto L15
            androidx.constraintlayout.widget.ConstraintLayout$a r0 = (androidx.constraintlayout.widget.ConstraintLayout.C0330a) r0
            w.j r1 = r2.f1781d0
            w.f r1 = (p381w.C6765f) r1
            r0.f1754l0 = r1
        L15:
            return
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            java.lang.String r0 = r1.f1782e0
            if (r0 == 0) goto La
            r1.setIds(r0)
        La:
            java.lang.String r0 = r1.f1783f0
            if (r0 == 0) goto L11
            r1.setReferenceTags(r0)
        L11:
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public void onMeasure(int r1, int r2) {
            r0 = this;
            r1 = 0
            r0.setMeasuredDimension(r1, r1)
            return
    }

    public void setIds(java.lang.String r4) {
            r3 = this;
            r3.f1782e0 = r4
            if (r4 != 0) goto L5
            return
        L5:
            r0 = 0
            r3.f1779b0 = r0
        L8:
            r1 = 44
            int r1 = r4.indexOf(r1, r0)
            r2 = -1
            if (r1 != r2) goto L19
            java.lang.String r4 = r4.substring(r0)
            r3.m935e(r4)
            return
        L19:
            java.lang.String r0 = r4.substring(r0, r1)
            r3.m935e(r0)
            int r0 = r1 + 1
            goto L8
    }

    public void setReferenceTags(java.lang.String r4) {
            r3 = this;
            r3.f1783f0 = r4
            if (r4 != 0) goto L5
            return
        L5:
            r0 = 0
            r3.f1779b0 = r0
        L8:
            r1 = 44
            int r1 = r4.indexOf(r1, r0)
            r2 = -1
            if (r1 != r2) goto L19
            java.lang.String r4 = r4.substring(r0)
            r3.m937g(r4)
            return
        L19:
            java.lang.String r0 = r4.substring(r0, r1)
            r3.m937g(r0)
            int r0 = r1 + 1
            goto L8
    }

    public void setReferencedIds(int[] r3) {
            r2 = this;
            r0 = 0
            r2.f1782e0 = r0
            r0 = 0
            r2.f1779b0 = r0
        L6:
            int r1 = r3.length
            if (r0 >= r1) goto L11
            r1 = r3[r0]
            r2.m936f(r1)
            int r0 = r0 + 1
            goto L6
        L11:
            return
    }

    @Override // android.view.View
    public void setTag(int r1, java.lang.Object r2) {
            r0 = this;
            super.setTag(r1, r2)
            if (r2 != 0) goto Lc
            java.lang.String r2 = r0.f1782e0
            if (r2 != 0) goto Lc
            r0.m936f(r1)
        Lc:
            return
    }
}
