package com.google.android.material.switchmaterial;

/* loaded from: classes.dex */
public class SwitchMaterial extends androidx.appcompat.widget.SwitchCompat {

    /* renamed from: S0 */
    public static final int[][] f6259S0 = null;

    /* renamed from: O0 */
    public final p166j8.C3451a f6260O0;

    /* renamed from: P0 */
    public android.content.res.ColorStateList f6261P0;

    /* renamed from: Q0 */
    public android.content.res.ColorStateList f6262Q0;

    /* renamed from: R0 */
    public boolean f6263R0;

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
            com.google.android.material.switchmaterial.SwitchMaterial.f6259S0 = r0
            return
    }

    public SwitchMaterial(android.content.Context r11, android.util.AttributeSet r12) {
            r10 = this;
            r0 = 2132017944(0x7f140318, float:1.967418E38)
            r1 = 2130969508(0x7f0403a4, float:1.75477E38)
            android.content.Context r11 = p431y8.C7133a.m14245a(r11, r12, r1, r0)
            r10.<init>(r11, r12, r1)
            android.content.Context r11 = r10.getContext()
            j8.a r2 = new j8.a
            r2.<init>(r11)
            r10.f6260O0 = r2
            int[] r8 = p339t7.C6183a.f23998K
            r9 = 0
            int[] r7 = new int[r9]
            p220m8.C4429m.m9878a(r11, r12, r1, r0)
            r6 = 2132017944(0x7f140318, float:1.967418E38)
            r5 = 2130969508(0x7f0403a4, float:1.75477E38)
            r2 = r11
            r3 = r12
            r4 = r8
            p220m8.C4429m.m9879b(r2, r3, r4, r5, r6, r7)
            android.content.res.TypedArray r11 = r11.obtainStyledAttributes(r12, r8, r1, r0)
            boolean r12 = r11.getBoolean(r9, r9)
            r10.f6263R0 = r12
            r11.recycle()
            return
    }

    /* renamed from: getMaterialThemeColorsThumbTintList */
    private android.content.res.ColorStateList m3498xff38add3() {
            r7 = this;
            android.content.res.ColorStateList r0 = r7.f6261P0
            if (r0 != 0) goto L53
            r0 = 2130968838(0x7f040106, float:1.754634E38)
            int r0 = p124h7.C2939x3.m7286l(r7, r0)
            r1 = 2130968821(0x7f0400f5, float:1.7546306E38)
            int r1 = p124h7.C2939x3.m7286l(r7, r1)
            android.content.res.Resources r2 = r7.getResources()
            r3 = 2131165644(0x7f0701cc, float:1.794551E38)
            float r2 = r2.getDimension(r3)
            j8.a r3 = r7.f6260O0
            boolean r3 = r3.f14920a
            if (r3 == 0) goto L28
            float r3 = p220m8.C4430n.m9885c(r7)
            float r2 = r2 + r3
        L28:
            j8.a r3 = r7.f6260O0
            int r2 = r3.m7912a(r0, r2)
            int[][] r3 = com.google.android.material.switchmaterial.SwitchMaterial.f6259S0
            int r4 = r3.length
            int[] r4 = new int[r4]
            r5 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            int r6 = p124h7.C2939x3.m7288n(r0, r1, r6)
            r4[r5] = r6
            r5 = 1
            r4[r5] = r2
            r5 = 2
            r6 = 1052938076(0x3ec28f5c, float:0.38)
            int r0 = p124h7.C2939x3.m7288n(r0, r1, r6)
            r4[r5] = r0
            r0 = 3
            r4[r0] = r2
            android.content.res.ColorStateList r0 = new android.content.res.ColorStateList
            r0.<init>(r3, r4)
            r7.f6261P0 = r0
        L53:
            android.content.res.ColorStateList r0 = r7.f6261P0
            return r0
    }

    /* renamed from: getMaterialThemeColorsTrackTintList */
    private android.content.res.ColorStateList m3499x55d4a848() {
            r7 = this;
            android.content.res.ColorStateList r0 = r7.f6262Q0
            if (r0 != 0) goto L4a
            int[][] r0 = com.google.android.material.switchmaterial.SwitchMaterial.f6259S0
            int r1 = r0.length
            int[] r1 = new int[r1]
            r2 = 2130968838(0x7f040106, float:1.754634E38)
            int r2 = p124h7.C2939x3.m7286l(r7, r2)
            r3 = 2130968821(0x7f0400f5, float:1.7546306E38)
            int r3 = p124h7.C2939x3.m7286l(r7, r3)
            r4 = 2130968830(0x7f0400fe, float:1.7546325E38)
            int r4 = p124h7.C2939x3.m7286l(r7, r4)
            r5 = 0
            r6 = 1057635697(0x3f0a3d71, float:0.54)
            int r6 = p124h7.C2939x3.m7288n(r2, r3, r6)
            r1[r5] = r6
            r5 = 1
            r6 = 1050924810(0x3ea3d70a, float:0.32)
            int r6 = p124h7.C2939x3.m7288n(r2, r4, r6)
            r1[r5] = r6
            r5 = 2
            r6 = 1039516303(0x3df5c28f, float:0.12)
            int r3 = p124h7.C2939x3.m7288n(r2, r3, r6)
            r1[r5] = r3
            r3 = 3
            int r2 = p124h7.C2939x3.m7288n(r2, r4, r6)
            r1[r3] = r2
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r0, r1)
            r7.f6262Q0 = r2
        L4a:
            android.content.res.ColorStateList r0 = r7.f6262Q0
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            boolean r0 = r1.f6263R0
            if (r0 == 0) goto L14
            android.content.res.ColorStateList r0 = r1.getThumbTintList()
            if (r0 != 0) goto L14
            android.content.res.ColorStateList r0 = r1.m3498xff38add3()
            r1.setThumbTintList(r0)
        L14:
            boolean r0 = r1.f6263R0
            if (r0 == 0) goto L25
            android.content.res.ColorStateList r0 = r1.getTrackTintList()
            if (r0 != 0) goto L25
            android.content.res.ColorStateList r0 = r1.m3499x55d4a848()
            r1.setTrackTintList(r0)
        L25:
            return
    }

    public void setUseMaterialThemeColors(boolean r1) {
            r0 = this;
            r0.f6263R0 = r1
            if (r1 == 0) goto L10
            android.content.res.ColorStateList r1 = r0.m3498xff38add3()
            r0.setThumbTintList(r1)
            android.content.res.ColorStateList r1 = r0.m3499x55d4a848()
            goto L14
        L10:
            r1 = 0
            r0.setThumbTintList(r1)
        L14:
            r0.setTrackTintList(r1)
            return
    }
}
