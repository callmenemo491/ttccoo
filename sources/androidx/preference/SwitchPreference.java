package androidx.preference;

/* loaded from: classes.dex */
public class SwitchPreference extends androidx.preference.TwoStatePreference {

    /* renamed from: q0 */
    public final androidx.preference.SwitchPreference.C0534a f3050q0;

    /* renamed from: r0 */
    public java.lang.CharSequence f3051r0;

    /* renamed from: s0 */
    public java.lang.CharSequence f3052s0;

    /* renamed from: androidx.preference.SwitchPreference$a */
    public class C0534a implements android.widget.CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ androidx.preference.SwitchPreference f3053a;

        public C0534a(androidx.preference.SwitchPreference r1) {
                r0 = this;
                r0.f3053a = r1
                r0.<init>()
                return
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(android.widget.CompoundButton r1, boolean r2) {
                r0 = this;
                androidx.preference.SwitchPreference r1 = r0.f3053a
                java.util.Objects.requireNonNull(r1)
                androidx.preference.SwitchPreference r1 = r0.f3053a
                r1.m1621o(r2)
                return
        }
    }

    public SwitchPreference(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r0 = 2130969507(0x7f0403a3, float:1.7547698E38)
            r1 = 16843629(0x101036d, float:2.3696016E-38)
            int r0 = p065e0.C1505j.m4087a(r4, r0, r1)
            r1 = 0
            r3.<init>(r4, r5, r0, r1)
            androidx.preference.SwitchPreference$a r2 = new androidx.preference.SwitchPreference$a
            r2.<init>(r3)
            r3.f3050q0 = r2
            int[] r2 = p139i1.C3062e.f12296j
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r0, r1)
            r5 = 7
            java.lang.String r5 = p065e0.C1505j.m4092f(r4, r5, r1)
            r3.f3059m0 = r5
            r5 = 6
            r0 = 1
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L2e
            java.lang.String r5 = r4.getString(r0)
        L2e:
            r3.f3060n0 = r5
            r5 = 9
            r0 = 3
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L3d
            java.lang.String r5 = r4.getString(r0)
        L3d:
            r3.f3051r0 = r5
            r5 = 8
            r0 = 4
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L4c
            java.lang.String r5 = r4.getString(r0)
        L4c:
            r3.f3052s0 = r5
            r5 = 5
            r0 = 2
            boolean r0 = r4.getBoolean(r0, r1)
            boolean r5 = r4.getBoolean(r5, r0)
            r3.f3062p0 = r5
            r4.recycle()
            return
    }
}
