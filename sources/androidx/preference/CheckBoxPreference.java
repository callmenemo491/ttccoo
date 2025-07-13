package androidx.preference;

/* loaded from: classes.dex */
public class CheckBoxPreference extends androidx.preference.TwoStatePreference {

    /* renamed from: q0 */
    public final androidx.preference.CheckBoxPreference.C0530a f3023q0;

    /* renamed from: androidx.preference.CheckBoxPreference$a */
    public class C0530a implements android.widget.CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ androidx.preference.CheckBoxPreference f3024a;

        public C0530a(androidx.preference.CheckBoxPreference r1) {
                r0 = this;
                r0.f3024a = r1
                r0.<init>()
                return
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(android.widget.CompoundButton r1, boolean r2) {
                r0 = this;
                androidx.preference.CheckBoxPreference r1 = r0.f3024a
                java.util.Objects.requireNonNull(r1)
                androidx.preference.CheckBoxPreference r1 = r0.f3024a
                r1.m1621o(r2)
                return
        }
    }

    public CheckBoxPreference(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r0 = 2130968764(0x7f0400bc, float:1.754619E38)
            r1 = 16842895(0x101008f, float:2.369396E-38)
            int r0 = p065e0.C1505j.m4087a(r4, r0, r1)
            r1 = 0
            r3.<init>(r4, r5, r0, r1)
            androidx.preference.CheckBoxPreference$a r2 = new androidx.preference.CheckBoxPreference$a
            r2.<init>(r3)
            r3.f3023q0 = r2
            int[] r2 = p139i1.C3062e.f12287a
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r0, r1)
            r5 = 5
            java.lang.String r5 = p065e0.C1505j.m4092f(r4, r5, r1)
            r3.f3059m0 = r5
            r5 = 4
            r0 = 1
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L2e
            java.lang.String r5 = r4.getString(r0)
        L2e:
            r3.f3060n0 = r5
            r5 = 3
            r0 = 2
            boolean r0 = r4.getBoolean(r0, r1)
            boolean r5 = r4.getBoolean(r5, r0)
            r3.f3062p0 = r5
            r4.recycle()
            return
    }
}
