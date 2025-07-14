package p272p8;

/* renamed from: p8.a */
/* loaded from: classes.dex */
public class C5375a extends androidx.appcompat.widget.C0299r {

    /* renamed from: f0 */
    public static final int[][] f21367f0 = null;

    /* renamed from: d0 */
    public android.content.res.ColorStateList f21368d0;

    /* renamed from: e0 */
    public boolean f21369e0;

    static {
            r0 = 4
            int[][] r0 = new int[r0][]
            r1 = 2
            int[] r2 = new int[r1]
            r2 = {x0026: FILL_ARRAY_DATA , data: [16842910, 16842912} // fill-array
            r3 = 0
            r0[r3] = r2
            int[] r2 = new int[r1]
            r2 = {x002e: FILL_ARRAY_DATA , data: [16842910, -16842912} // fill-array
            r3 = 1
            r0[r3] = r2
            int[] r2 = new int[r1]
            r2 = {x0036: FILL_ARRAY_DATA , data: [-16842910, 16842912} // fill-array
            r0[r1] = r2
            int[] r1 = new int[r1]
            r1 = {x003e: FILL_ARRAY_DATA , data: [-16842910, -16842912} // fill-array
            r2 = 3
            r0[r2] = r1
            p272p8.C5375a.f21367f0 = r0
            return
    }

    public C5375a(android.content.Context r9, android.util.AttributeSet r10) {
            r8 = this;
            r0 = 2132017943(0x7f140317, float:1.9674179E38)
            r1 = 2130969390(0x7f04032e, float:1.754746E38)
            android.content.Context r9 = p431y8.C7133a.m14245a(r9, r10, r1, r0)
            r8.<init>(r9, r10, r1)
            android.content.Context r9 = r8.getContext()
            int[] r4 = p339t7.C6183a.f24029z
            r0 = 0
            int[] r7 = new int[r0]
            r6 = 2132017943(0x7f140317, float:1.9674179E38)
            r5 = 2130969390(0x7f04032e, float:1.754746E38)
            r2 = r9
            r3 = r10
            android.content.res.TypedArray r10 = p220m8.C4429m.m9881d(r2, r3, r4, r5, r6, r7)
            boolean r1 = r10.hasValue(r0)
            if (r1 == 0) goto L2f
            android.content.res.ColorStateList r9 = p288q8.C5599c.m11875a(r9, r10, r0)
            r8.setButtonTintList(r9)
        L2f:
            r9 = 1
            boolean r9 = r10.getBoolean(r9, r0)
            r8.f21369e0 = r9
            r10.recycle()
            return
    }

    private android.content.res.ColorStateList getMaterialThemeColorsTintList() {
            r7 = this;
            android.content.res.ColorStateList r0 = r7.f21368d0
            if (r0 != 0) goto L49
            r0 = 2130968821(0x7f0400f5, float:1.7546306E38)
            int r0 = p124h7.C2939x3.m7286l(r7, r0)
            r1 = 2130968830(0x7f0400fe, float:1.7546325E38)
            int r1 = p124h7.C2939x3.m7286l(r7, r1)
            r2 = 2130968838(0x7f040106, float:1.754634E38)
            int r2 = p124h7.C2939x3.m7286l(r7, r2)
            int[][] r3 = p272p8.C5375a.f21367f0
            int r4 = r3.length
            int[] r4 = new int[r4]
            r5 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            int r0 = p124h7.C2939x3.m7288n(r2, r0, r6)
            r4[r5] = r0
            r0 = 1
            r5 = 1057635697(0x3f0a3d71, float:0.54)
            int r5 = p124h7.C2939x3.m7288n(r2, r1, r5)
            r4[r0] = r5
            r0 = 2
            r5 = 1052938076(0x3ec28f5c, float:0.38)
            int r6 = p124h7.C2939x3.m7288n(r2, r1, r5)
            r4[r0] = r6
            r0 = 3
            int r1 = p124h7.C2939x3.m7288n(r2, r1, r5)
            r4[r0] = r1
            android.content.res.ColorStateList r0 = new android.content.res.ColorStateList
            r0.<init>(r3, r4)
            r7.f21368d0 = r0
        L49:
            android.content.res.ColorStateList r0 = r7.f21368d0
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            boolean r0 = r1.f21369e0
            if (r0 == 0) goto L11
            android.content.res.ColorStateList r0 = r1.getButtonTintList()
            if (r0 != 0) goto L11
            r0 = 1
            r1.setUseMaterialThemeColors(r0)
        L11:
            return
    }

    public void setUseMaterialThemeColors(boolean r1) {
            r0 = this;
            r0.f21369e0 = r1
            if (r1 == 0) goto Lc
            android.content.res.ColorStateList r1 = r0.getMaterialThemeColorsTintList()
        L8:
            r0.setButtonTintList(r1)
            goto Le
        Lc:
            r1 = 0
            goto L8
        Le:
            return
    }
}
