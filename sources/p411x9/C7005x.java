package p411x9;

/* renamed from: x9.x */
/* loaded from: classes.dex */
public final class C7005x {

    /* renamed from: a */
    public static final p411x9.C7005x f27301a = null;

    static {
            x9.x r0 = new x9.x
            r0.<init>()
            p411x9.C7005x.f27301a = r0
            return
    }

    public C7005x() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static void m14151a(android.content.SharedPreferences r2) {
            android.content.SharedPreferences$Editor r0 = r2.edit()
            java.util.Map r2 = r2.getAll()
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L10:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.remove(r1)
            goto L10
        L20:
            r0.apply()
            return
    }

    /* renamed from: b */
    public static final android.content.SharedPreferences m14152b(android.content.Context r2, java.lang.String r3) {
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "com.google.firebase.auth.internal.browserSignInSessionStore.%s"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r1)
            return r2
    }
}
