package androidx.preference;

/* loaded from: classes.dex */
public abstract class TwoStatePreference extends androidx.preference.Preference {

    /* renamed from: l0 */
    public boolean f3058l0;

    /* renamed from: m0 */
    public java.lang.CharSequence f3059m0;

    /* renamed from: n0 */
    public java.lang.CharSequence f3060n0;

    /* renamed from: o0 */
    public boolean f3061o0;

    /* renamed from: p0 */
    public boolean f3062p0;

    public TwoStatePreference(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r0)
            return
    }

    public TwoStatePreference(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // androidx.preference.Preference
    /* renamed from: k */
    public java.lang.Object mo1615k(android.content.res.TypedArray r2, int r3) {
            r1 = this;
            r0 = 0
            boolean r2 = r2.getBoolean(r3, r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
    }

    @Override // androidx.preference.Preference
    /* renamed from: l */
    public boolean mo1620l() {
            r3 = this;
            boolean r0 = r3.f3062p0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L9
            boolean r0 = r3.f3058l0
            goto L10
        L9:
            boolean r0 = r3.f3058l0
            if (r0 != 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 != 0) goto L1a
            boolean r0 = super.mo1620l()
            if (r0 == 0) goto L19
            goto L1a
        L19:
            r1 = 0
        L1a:
            return r1
    }

    /* renamed from: o */
    public void m1621o(boolean r4) {
            r3 = this;
            boolean r0 = r3.f3058l0
            r1 = 1
            if (r0 == r4) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            if (r0 != 0) goto Le
            boolean r2 = r3.f3061o0
            if (r2 != 0) goto L17
        Le:
            r3.f3058l0 = r4
            r3.f3061o0 = r1
            if (r0 == 0) goto L17
            r3.mo1620l()
        L17:
            return
    }
}
