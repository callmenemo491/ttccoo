package p147i9;

/* renamed from: i9.d */
/* loaded from: classes.dex */
public final class C3118d implements p093f9.InterfaceC2092j {

    /* renamed from: a */
    public final android.content.SharedPreferences.Editor f12515a;

    /* renamed from: b */
    public final java.lang.String f12516b;

    public C3118d(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.f12516b = r2
            android.content.Context r1 = r1.getApplicationContext()
            if (r3 != 0) goto L10
            android.content.SharedPreferences r1 = android.preference.PreferenceManager.getDefaultSharedPreferences(r1)
            goto L15
        L10:
            r2 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r3, r2)
        L15:
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r0.f12515a = r1
            return
    }
}
