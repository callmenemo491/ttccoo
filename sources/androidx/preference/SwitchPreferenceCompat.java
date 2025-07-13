package androidx.preference;

/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends androidx.preference.TwoStatePreference {

    /* renamed from: q0 */
    public final androidx.preference.SwitchPreferenceCompat.C0535a f3054q0;

    /* renamed from: r0 */
    public java.lang.CharSequence f3055r0;

    /* renamed from: s0 */
    public java.lang.CharSequence f3056s0;

    /* renamed from: androidx.preference.SwitchPreferenceCompat$a */
    public class C0535a implements android.widget.CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ androidx.preference.SwitchPreferenceCompat f3057a;

        public C0535a(androidx.preference.SwitchPreferenceCompat r1) {
                r0 = this;
                r0.f3057a = r1
                r0.<init>()
                return
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(android.widget.CompoundButton r1, boolean r2) {
                r0 = this;
                androidx.preference.SwitchPreferenceCompat r1 = r0.f3057a
                java.util.Objects.requireNonNull(r1)
                androidx.preference.SwitchPreferenceCompat r1 = r0.f3057a
                r1.m1621o(r2)
                return
        }
    }

    public SwitchPreferenceCompat(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r0 = 0
            r1 = 2130969506(0x7f0403a2, float:1.7547696E38)
            r3.<init>(r4, r5, r1, r0)
            androidx.preference.SwitchPreferenceCompat$a r2 = new androidx.preference.SwitchPreferenceCompat$a
            r2.<init>(r3)
            r3.f3054q0 = r2
            int[] r2 = p139i1.C3062e.f12297k
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r1, r0)
            r5 = 7
            java.lang.String r5 = p065e0.C1505j.m4092f(r4, r5, r0)
            r3.f3059m0 = r5
            r5 = 6
            r1 = 1
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L27
            java.lang.String r5 = r4.getString(r1)
        L27:
            r3.f3060n0 = r5
            r5 = 9
            r1 = 3
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L36
            java.lang.String r5 = r4.getString(r1)
        L36:
            r3.f3055r0 = r5
            r5 = 8
            r1 = 4
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L45
            java.lang.String r5 = r4.getString(r1)
        L45:
            r3.f3056s0 = r5
            r5 = 5
            r1 = 2
            boolean r0 = r4.getBoolean(r1, r0)
            boolean r5 = r4.getBoolean(r5, r0)
            r3.f3062p0 = r5
            r4.recycle()
            return
    }
}
