package androidx.preference;

/* loaded from: classes.dex */
public class EditTextPreference extends androidx.preference.DialogPreference {

    /* renamed from: androidx.preference.EditTextPreference$a */
    public static final class C0531a implements androidx.preference.Preference.InterfaceC0533a<androidx.preference.EditTextPreference> {

        /* renamed from: a */
        public static androidx.preference.EditTextPreference.C0531a f3027a;

        public C0531a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.preference.Preference.InterfaceC0533a
        /* renamed from: a */
        public java.lang.CharSequence mo1616a(androidx.preference.Preference r3) {
                r2 = this;
                androidx.preference.EditTextPreference r3 = (androidx.preference.EditTextPreference) r3
                r0 = 0
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 == 0) goto L12
                android.content.Context r3 = r3.f3033Y
                r0 = 2131951944(0x7f130148, float:1.9540317E38)
                java.lang.String r0 = r3.getString(r0)
            L12:
                return r0
        }
    }

    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r0 = 2130968948(0x7f040174, float:1.7546564E38)
            r1 = 16842898(0x1010092, float:2.3693967E-38)
            int r0 = p065e0.C1505j.m4087a(r4, r0, r1)
            r1 = 0
            r3.<init>(r4, r5, r0, r1)
            int[] r2 = p139i1.C3062e.f12289c
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r0, r1)
            boolean r5 = p065e0.C1505j.m4088b(r4, r1, r1, r1)
            if (r5 == 0) goto L29
            androidx.preference.EditTextPreference$a r5 = androidx.preference.EditTextPreference.C0531a.f3027a
            if (r5 != 0) goto L25
            androidx.preference.EditTextPreference$a r5 = new androidx.preference.EditTextPreference$a
            r5.<init>()
            androidx.preference.EditTextPreference.C0531a.f3027a = r5
        L25:
            androidx.preference.EditTextPreference$a r5 = androidx.preference.EditTextPreference.C0531a.f3027a
            r3.f3045k0 = r5
        L29:
            r4.recycle()
            return
    }

    @Override // androidx.preference.Preference
    /* renamed from: k */
    public java.lang.Object mo1615k(android.content.res.TypedArray r1, int r2) {
            r0 = this;
            java.lang.String r1 = r1.getString(r2)
            return r1
    }
}
