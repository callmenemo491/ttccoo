package androidx.preference;

/* loaded from: classes.dex */
public class ListPreference extends androidx.preference.DialogPreference {

    /* renamed from: l0 */
    public java.lang.CharSequence[] f3028l0;

    /* renamed from: m0 */
    public java.lang.CharSequence[] f3029m0;

    /* renamed from: n0 */
    public java.lang.String f3030n0;

    /* renamed from: o0 */
    public java.lang.String f3031o0;

    /* renamed from: androidx.preference.ListPreference$a */
    public static final class C0532a implements androidx.preference.Preference.InterfaceC0533a<androidx.preference.ListPreference> {

        /* renamed from: a */
        public static androidx.preference.ListPreference.C0532a f3032a;

        public C0532a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.preference.Preference.InterfaceC0533a
        /* renamed from: a */
        public java.lang.CharSequence mo1616a(androidx.preference.Preference r2) {
                r1 = this;
                androidx.preference.ListPreference r2 = (androidx.preference.ListPreference) r2
                java.lang.CharSequence r0 = r2.m1618o()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L16
                android.content.Context r2 = r2.f3033Y
                r0 = 2131951944(0x7f130148, float:1.9540317E38)
                java.lang.String r2 = r2.getString(r0)
                goto L1a
            L16:
                java.lang.CharSequence r2 = r2.m1618o()
            L1a:
                return r2
        }
    }

    public ListPreference(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r0 = 2130968917(0x7f040155, float:1.7546501E38)
            r1 = 16842897(0x1010091, float:2.3693964E-38)
            int r0 = p065e0.C1505j.m4087a(r3, r0, r1)
            r1 = 0
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public ListPreference(android.content.Context r4, android.util.AttributeSet r5, int r6, int r7) {
            r3 = this;
            r3.<init>(r4, r5, r6, r7)
            int[] r0 = p139i1.C3062e.f12290d
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r5, r0, r6, r7)
            r1 = 2
            r2 = 0
            java.lang.CharSequence[] r1 = p065e0.C1505j.m4093g(r0, r1, r2)
            r3.f3028l0 = r1
            r1 = 3
            java.lang.CharSequence[] r1 = r0.getTextArray(r1)
            if (r1 != 0) goto L1d
            r1 = 1
            java.lang.CharSequence[] r1 = r0.getTextArray(r1)
        L1d:
            r3.f3029m0 = r1
            r1 = 4
            boolean r2 = r0.getBoolean(r1, r2)
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 == 0) goto L3c
            androidx.preference.ListPreference$a r1 = androidx.preference.ListPreference.C0532a.f3032a
            if (r1 != 0) goto L35
            androidx.preference.ListPreference$a r1 = new androidx.preference.ListPreference$a
            r1.<init>()
            androidx.preference.ListPreference.C0532a.f3032a = r1
        L35:
            androidx.preference.ListPreference$a r1 = androidx.preference.ListPreference.C0532a.f3032a
            r3.f3045k0 = r1
            r3.mo1614h()
        L3c:
            r0.recycle()
            int[] r0 = p139i1.C3062e.f12292f
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r0, r6, r7)
            r5 = 33
            r6 = 7
            java.lang.String r5 = p065e0.C1505j.m4092f(r4, r5, r6)
            r3.f3031o0 = r5
            r4.recycle()
            return
    }

    @Override // androidx.preference.Preference
    /* renamed from: e */
    public java.lang.CharSequence mo1617e() {
            r5 = this;
            androidx.preference.Preference$a r0 = r5.f3045k0
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.mo1616a(r5)
            return r0
        L9:
            java.lang.CharSequence r0 = r5.m1618o()
            java.lang.CharSequence r1 = super.mo1617e()
            java.lang.String r2 = r5.f3031o0
            if (r2 != 0) goto L16
            return r1
        L16:
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            if (r0 != 0) goto L1e
            java.lang.String r0 = ""
        L1e:
            r3[r4] = r0
            java.lang.String r0 = java.lang.String.format(r2, r3)
            boolean r2 = android.text.TextUtils.equals(r0, r1)
            if (r2 == 0) goto L2b
            return r1
        L2b:
            java.lang.String r1 = "ListPreference"
            java.lang.String r2 = "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead."
            android.util.Log.w(r1, r2)
            return r0
    }

    @Override // androidx.preference.Preference
    /* renamed from: k */
    public java.lang.Object mo1615k(android.content.res.TypedArray r1, int r2) {
            r0 = this;
            java.lang.String r1 = r1.getString(r2)
            return r1
    }

    /* renamed from: o */
    public java.lang.CharSequence m1618o() {
            r4 = this;
            java.lang.String r0 = r4.f3030n0
            r1 = -1
            if (r0 == 0) goto L1c
            java.lang.CharSequence[] r2 = r4.f3029m0
            if (r2 == 0) goto L1c
            int r2 = r2.length
            int r2 = r2 + r1
        Lb:
            if (r2 < 0) goto L1c
            java.lang.CharSequence[] r3 = r4.f3029m0
            r3 = r3[r2]
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L19
            r1 = r2
            goto L1c
        L19:
            int r2 = r2 + (-1)
            goto Lb
        L1c:
            if (r1 < 0) goto L25
            java.lang.CharSequence[] r0 = r4.f3028l0
            if (r0 == 0) goto L25
            r0 = r0[r1]
            goto L26
        L25:
            r0 = 0
        L26:
            return r0
    }
}
