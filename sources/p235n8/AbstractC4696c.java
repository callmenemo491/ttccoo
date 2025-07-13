package p235n8;

/* renamed from: n8.c */
/* loaded from: classes.dex */
public abstract class AbstractC4696c extends android.view.ViewGroup implements androidx.appcompat.view.menu.InterfaceC0216j {

    /* renamed from: t0 */
    public static final int[] f18741t0 = null;

    /* renamed from: u0 */
    public static final int[] f18742u0 = null;

    /* renamed from: a0 */
    public final p333t1.C6109m f18743a0;

    /* renamed from: b0 */
    public final android.view.View.OnClickListener f18744b0;

    /* renamed from: c0 */
    public final p212m0.InterfaceC4313c<p235n8.AbstractC4694a> f18745c0;

    /* renamed from: d0 */
    public final android.util.SparseArray<android.view.View.OnTouchListener> f18746d0;

    /* renamed from: e0 */
    public int f18747e0;

    /* renamed from: f0 */
    public p235n8.AbstractC4694a[] f18748f0;

    /* renamed from: g0 */
    public int f18749g0;

    /* renamed from: h0 */
    public int f18750h0;

    /* renamed from: i0 */
    public android.content.res.ColorStateList f18751i0;

    /* renamed from: j0 */
    public int f18752j0;

    /* renamed from: k0 */
    public android.content.res.ColorStateList f18753k0;

    /* renamed from: l0 */
    public final android.content.res.ColorStateList f18754l0;

    /* renamed from: m0 */
    public int f18755m0;

    /* renamed from: n0 */
    public int f18756n0;

    /* renamed from: o0 */
    public android.graphics.drawable.Drawable f18757o0;

    /* renamed from: p0 */
    public int f18758p0;

    /* renamed from: q0 */
    public android.util.SparseArray<p389w7.C6817a> f18759q0;

    /* renamed from: r0 */
    public p235n8.C4697d f18760r0;

    /* renamed from: s0 */
    public androidx.appcompat.view.menu.C0211e f18761s0;

    /* renamed from: n8.c$a */
    public class a implements android.view.View.OnClickListener {

        /* renamed from: Y */
        public final /* synthetic */ p235n8.AbstractC4696c f18762Y;

        public a(p235n8.AbstractC4696c r1) {
                r0 = this;
                r0.f18762Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                n8.a r4 = (p235n8.AbstractC4694a) r4
                androidx.appcompat.view.menu.g r4 = r4.getItemData()
                n8.c r0 = r3.f18762Y
                androidx.appcompat.view.menu.e r1 = r0.f18761s0
                n8.d r0 = r0.f18760r0
                r2 = 0
                boolean r0 = r1.m515r(r4, r0, r2)
                if (r0 != 0) goto L17
                r0 = 1
                r4.setChecked(r0)
            L17:
                return
        }
    }

    static {
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            r3 = 0
            r1[r3] = r2
            p235n8.AbstractC4696c.f18741t0 = r1
            int[] r0 = new int[r0]
            r1 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r0[r3] = r1
            p235n8.AbstractC4696c.f18742u0 = r0
            return
    }

    public AbstractC4696c(android.content.Context r4) {
            r3 = this;
            r3.<init>(r4)
            m0.d r4 = new m0.d
            r0 = 5
            r4.<init>(r0)
            r3.f18745c0 = r4
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>(r0)
            r3.f18746d0 = r4
            r4 = 0
            r3.f18749g0 = r4
            r3.f18750h0 = r4
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>(r0)
            r3.f18759q0 = r1
            r0 = 16842808(0x1010038, float:2.3693715E-38)
            android.content.res.ColorStateList r0 = r3.m10743c(r0)
            r3.f18754l0 = r0
            t1.a r0 = new t1.a
            r0.<init>()
            r3.f18743a0 = r0
            r0.m12637R(r4)
            r1 = 115(0x73, double:5.7E-322)
            r0.m12635O(r1)
            y0.b r4 = new y0.b
            r4.<init>()
            r0.m12636P(r4)
            m8.k r4 = new m8.k
            r4.<init>()
            r0.m12633M(r4)
            n8.c$a r4 = new n8.c$a
            r4.<init>(r3)
            r3.f18744b0 = r4
            java.util.WeakHashMap<android.view.View, n0.w> r4 = p227n0.C4661t.f18570a
            r4 = 1
            p227n0.C4661t.c.m10571s(r3, r4)
            return
    }

    private p235n8.AbstractC4694a getNewItem() {
            r1 = this;
            m0.c<n8.a> r0 = r1.f18745c0
            java.lang.Object r0 = r0.mo6231b()
            n8.a r0 = (p235n8.AbstractC4694a) r0
            if (r0 != 0) goto L12
            android.content.Context r0 = r1.getContext()
            n8.a r0 = r1.mo10744d(r0)
        L12:
            return r0
    }

    private void setBadgeIfNeeded(p235n8.AbstractC4694a r3) {
            r2 = this;
            int r0 = r3.getId()
            r1 = -1
            if (r0 == r1) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            if (r1 != 0) goto Ld
            return
        Ld:
            android.util.SparseArray<w7.a> r1 = r2.f18759q0
            java.lang.Object r0 = r1.get(r0)
            w7.a r0 = (p389w7.C6817a) r0
            if (r0 == 0) goto L1a
            r3.setBadge(r0)
        L1a:
            return
    }

    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: a */
    public void m10742a() {
            r9 = this;
            r9.removeAllViews()
            n8.a[] r0 = r9.f18748f0
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L32
            int r4 = r0.length
            r5 = 0
        Lc:
            if (r5 >= r4) goto L32
            r6 = r0[r5]
            if (r6 == 0) goto L2f
            m0.c<n8.a> r7 = r9.f18745c0
            r7.mo6230a(r6)
            android.widget.ImageView r7 = r6.f18728g0
            boolean r8 = r6.m10741b()
            if (r8 != 0) goto L20
            goto L2f
        L20:
            if (r7 == 0) goto L2d
            r6.setClipChildren(r3)
            r6.setClipToPadding(r3)
            w7.a r8 = r6.f18737p0
            p389w7.C6818b.m13901b(r8, r7)
        L2d:
            r6.f18737p0 = r1
        L2f:
            int r5 = r5 + 1
            goto Lc
        L32:
            androidx.appcompat.view.menu.e r0 = r9.f18761s0
            int r0 = r0.size()
            if (r0 != 0) goto L41
            r9.f18749g0 = r2
            r9.f18750h0 = r2
            r9.f18748f0 = r1
            return
        L41:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1 = 0
        L47:
            androidx.appcompat.view.menu.e r4 = r9.f18761s0
            int r4 = r4.size()
            if (r1 >= r4) goto L63
            androidx.appcompat.view.menu.e r4 = r9.f18761s0
            android.view.MenuItem r4 = r4.getItem(r1)
            int r4 = r4.getItemId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.add(r4)
            int r1 = r1 + 1
            goto L47
        L63:
            r1 = 0
        L64:
            android.util.SparseArray<w7.a> r4 = r9.f18759q0
            int r4 = r4.size()
            if (r1 >= r4) goto L84
            android.util.SparseArray<w7.a> r4 = r9.f18759q0
            int r4 = r4.keyAt(r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            boolean r5 = r0.contains(r5)
            if (r5 != 0) goto L81
            android.util.SparseArray<w7.a> r5 = r9.f18759q0
            r5.delete(r4)
        L81:
            int r1 = r1 + 1
            goto L64
        L84:
            androidx.appcompat.view.menu.e r0 = r9.f18761s0
            int r0 = r0.size()
            n8.a[] r0 = new p235n8.AbstractC4694a[r0]
            r9.f18748f0 = r0
            int r0 = r9.f18747e0
            androidx.appcompat.view.menu.e r1 = r9.f18761s0
            java.util.ArrayList r1 = r1.m509l()
            int r1 = r1.size()
            boolean r0 = r9.m10745e(r0, r1)
            r1 = 0
        L9f:
            androidx.appcompat.view.menu.e r4 = r9.f18761s0
            int r4 = r4.size()
            if (r1 >= r4) goto L125
            n8.d r4 = r9.f18760r0
            r4.f18764Z = r3
            androidx.appcompat.view.menu.e r4 = r9.f18761s0
            android.view.MenuItem r4 = r4.getItem(r1)
            r4.setCheckable(r3)
            n8.d r4 = r9.f18760r0
            r4.f18764Z = r2
            n8.a r4 = r9.getNewItem()
            n8.a[] r5 = r9.f18748f0
            r5[r1] = r4
            android.content.res.ColorStateList r5 = r9.f18751i0
            r4.setIconTintList(r5)
            int r5 = r9.f18752j0
            r4.setIconSize(r5)
            android.content.res.ColorStateList r5 = r9.f18754l0
            r4.setTextColor(r5)
            int r5 = r9.f18755m0
            r4.setTextAppearanceInactive(r5)
            int r5 = r9.f18756n0
            r4.setTextAppearanceActive(r5)
            android.content.res.ColorStateList r5 = r9.f18753k0
            r4.setTextColor(r5)
            android.graphics.drawable.Drawable r5 = r9.f18757o0
            if (r5 == 0) goto Le6
            r4.setItemBackground(r5)
            goto Leb
        Le6:
            int r5 = r9.f18758p0
            r4.setItemBackground(r5)
        Leb:
            r4.setShifting(r0)
            int r5 = r9.f18747e0
            r4.setLabelVisibilityMode(r5)
            androidx.appcompat.view.menu.e r5 = r9.f18761s0
            android.view.MenuItem r5 = r5.getItem(r1)
            androidx.appcompat.view.menu.g r5 = (androidx.appcompat.view.menu.C0213g) r5
            r4.mo459d(r5, r2)
            r4.setItemPosition(r1)
            int r5 = r5.f839a
            android.util.SparseArray<android.view.View$OnTouchListener> r6 = r9.f18746d0
            java.lang.Object r6 = r6.get(r5)
            android.view.View$OnTouchListener r6 = (android.view.View.OnTouchListener) r6
            r4.setOnTouchListener(r6)
            android.view.View$OnClickListener r6 = r9.f18744b0
            r4.setOnClickListener(r6)
            int r6 = r9.f18749g0
            if (r6 == 0) goto L11b
            if (r5 != r6) goto L11b
            r9.f18750h0 = r1
        L11b:
            r9.setBadgeIfNeeded(r4)
            r9.addView(r4)
            int r1 = r1 + 1
            goto L9f
        L125:
            androidx.appcompat.view.menu.e r0 = r9.f18761s0
            int r0 = r0.size()
            int r0 = r0 - r3
            int r1 = r9.f18750h0
            int r0 = java.lang.Math.min(r0, r1)
            r9.f18750h0 = r0
            androidx.appcompat.view.menu.e r1 = r9.f18761s0
            android.view.MenuItem r0 = r1.getItem(r0)
            r0.setChecked(r3)
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0216j
    /* renamed from: b */
    public void mo465b(androidx.appcompat.view.menu.C0211e r1) {
            r0 = this;
            r0.f18761s0 = r1
            return
    }

    /* renamed from: c */
    public android.content.res.ColorStateList m10743c(int r11) {
            r10 = this;
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r10.getContext()
            android.content.res.Resources$Theme r1 = r1.getTheme()
            r2 = 1
            boolean r11 = r1.resolveAttribute(r11, r0, r2)
            r1 = 0
            if (r11 != 0) goto L16
            return r1
        L16:
            android.content.Context r11 = r10.getContext()
            int r3 = r0.resourceId
            android.content.res.ColorStateList r11 = p102g.C2199a.m5783a(r11, r3)
            android.content.Context r3 = r10.getContext()
            android.content.res.Resources$Theme r3 = r3.getTheme()
            r4 = 2130968831(0x7f0400ff, float:1.7546327E38)
            boolean r3 = r3.resolveAttribute(r4, r0, r2)
            if (r3 != 0) goto L32
            return r1
        L32:
            int r0 = r0.data
            int r1 = r11.getDefaultColor()
            android.content.res.ColorStateList r3 = new android.content.res.ColorStateList
            r4 = 3
            int[][] r5 = new int[r4][]
            int[] r6 = p235n8.AbstractC4696c.f18742u0
            r7 = 0
            r5[r7] = r6
            int[] r8 = p235n8.AbstractC4696c.f18741t0
            r5[r2] = r8
            int[] r8 = android.view.ViewGroup.EMPTY_STATE_SET
            r9 = 2
            r5[r9] = r8
            int[] r4 = new int[r4]
            int r11 = r11.getColorForState(r6, r1)
            r4[r7] = r11
            r4[r2] = r0
            r4[r9] = r1
            r3.<init>(r5, r4)
            return r3
    }

    /* renamed from: d */
    public abstract p235n8.AbstractC4694a mo10744d(android.content.Context r1);

    /* renamed from: e */
    public boolean m10745e(int r4, int r5) {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L9
            r4 = 3
            if (r5 <= r4) goto Lc
            goto Ld
        L9:
            if (r4 != 0) goto Lc
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public android.util.SparseArray<p389w7.C6817a> getBadgeDrawables() {
            r1 = this;
            android.util.SparseArray<w7.a> r0 = r1.f18759q0
            return r0
    }

    public android.content.res.ColorStateList getIconTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f18751i0
            return r0
    }

    public android.graphics.drawable.Drawable getItemBackground() {
            r2 = this;
            n8.a[] r0 = r2.f18748f0
            if (r0 == 0) goto Lf
            int r1 = r0.length
            if (r1 <= 0) goto Lf
            r1 = 0
            r0 = r0[r1]
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            return r0
        Lf:
            android.graphics.drawable.Drawable r0 = r2.f18757o0
            return r0
    }

    @java.lang.Deprecated
    public int getItemBackgroundRes() {
            r1 = this;
            int r0 = r1.f18758p0
            return r0
    }

    public int getItemIconSize() {
            r1 = this;
            int r0 = r1.f18752j0
            return r0
    }

    public int getItemTextAppearanceActive() {
            r1 = this;
            int r0 = r1.f18756n0
            return r0
    }

    public int getItemTextAppearanceInactive() {
            r1 = this;
            int r0 = r1.f18755m0
            return r0
    }

    public android.content.res.ColorStateList getItemTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f18753k0
            return r0
    }

    public int getLabelVisibilityMode() {
            r1 = this;
            int r0 = r1.f18747e0
            return r0
    }

    public androidx.appcompat.view.menu.C0211e getMenu() {
            r1 = this;
            androidx.appcompat.view.menu.e r0 = r1.f18761s0
            return r0
    }

    public int getSelectedItemId() {
            r1 = this;
            int r0 = r1.f18749g0
            return r0
    }

    public int getSelectedItemPosition() {
            r1 = this;
            int r0 = r1.f18750h0
            return r0
    }

    public int getWindowAnimations() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r4) {
            r3 = this;
            super.onInitializeAccessibilityNodeInfo(r4)
            androidx.appcompat.view.menu.e r0 = r3.f18761s0
            java.util.ArrayList r0 = r0.m509l()
            int r0 = r0.size()
            r1 = 0
            r2 = 1
            o0.b$b r0 = p242o0.C4868b.b.m11001a(r2, r0, r1, r2)
            java.lang.Object r0 = r0.f19352a
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) r0
            r4.setCollectionInfo(r0)
            return
    }

    public void setBadgeDrawables(android.util.SparseArray<p389w7.C6817a> r6) {
            r5 = this;
            r5.f18759q0 = r6
            n8.a[] r0 = r5.f18748f0
            if (r0 == 0) goto L1c
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L1c
            r3 = r0[r2]
            int r4 = r3.getId()
            java.lang.Object r4 = r6.get(r4)
            w7.a r4 = (p389w7.C6817a) r4
            r3.setBadge(r4)
            int r2 = r2 + 1
            goto L8
        L1c:
            return
    }

    public void setIconTintList(android.content.res.ColorStateList r5) {
            r4 = this;
            r4.f18751i0 = r5
            n8.a[] r0 = r4.f18748f0
            if (r0 == 0) goto L12
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            r3.setIconTintList(r5)
            int r2 = r2 + 1
            goto L8
        L12:
            return
    }

    public void setItemBackground(android.graphics.drawable.Drawable r5) {
            r4 = this;
            r4.f18757o0 = r5
            n8.a[] r0 = r4.f18748f0
            if (r0 == 0) goto L12
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            r3.setItemBackground(r5)
            int r2 = r2 + 1
            goto L8
        L12:
            return
    }

    public void setItemBackgroundRes(int r5) {
            r4 = this;
            r4.f18758p0 = r5
            n8.a[] r0 = r4.f18748f0
            if (r0 == 0) goto L12
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            r3.setItemBackground(r5)
            int r2 = r2 + 1
            goto L8
        L12:
            return
    }

    public void setItemIconSize(int r5) {
            r4 = this;
            r4.f18752j0 = r5
            n8.a[] r0 = r4.f18748f0
            if (r0 == 0) goto L12
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            r3.setIconSize(r5)
            int r2 = r2 + 1
            goto L8
        L12:
            return
    }

    public void setItemTextAppearanceActive(int r6) {
            r5 = this;
            r5.f18756n0 = r6
            n8.a[] r0 = r5.f18748f0
            if (r0 == 0) goto L19
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            r3.setTextAppearanceActive(r6)
            android.content.res.ColorStateList r4 = r5.f18753k0
            if (r4 == 0) goto L16
            r3.setTextColor(r4)
        L16:
            int r2 = r2 + 1
            goto L8
        L19:
            return
    }

    public void setItemTextAppearanceInactive(int r6) {
            r5 = this;
            r5.f18755m0 = r6
            n8.a[] r0 = r5.f18748f0
            if (r0 == 0) goto L19
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            r3.setTextAppearanceInactive(r6)
            android.content.res.ColorStateList r4 = r5.f18753k0
            if (r4 == 0) goto L16
            r3.setTextColor(r4)
        L16:
            int r2 = r2 + 1
            goto L8
        L19:
            return
    }

    public void setItemTextColor(android.content.res.ColorStateList r5) {
            r4 = this;
            r4.f18753k0 = r5
            n8.a[] r0 = r4.f18748f0
            if (r0 == 0) goto L12
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            r3.setTextColor(r5)
            int r2 = r2 + 1
            goto L8
        L12:
            return
    }

    public void setLabelVisibilityMode(int r1) {
            r0 = this;
            r0.f18747e0 = r1
            return
    }

    public void setPresenter(p235n8.C4697d r1) {
            r0 = this;
            r0.f18760r0 = r1
            return
    }
}
