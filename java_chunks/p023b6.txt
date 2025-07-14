package p023b6;

/* renamed from: b6.a */
/* loaded from: classes.dex */
public class C0682a {

    /* renamed from: c */
    public static final java.util.concurrent.locks.Lock f3867c = null;

    /* renamed from: d */
    public static p023b6.C0682a f3868d;

    /* renamed from: a */
    public final java.util.concurrent.locks.Lock f3869a;

    /* renamed from: b */
    public final android.content.SharedPreferences f3870b;

    static {
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            p023b6.C0682a.f3867c = r0
            return
    }

    public C0682a(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r2.f3869a = r0
            java.lang.String r0 = "com.google.android.gms.signin"
            r1 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r0, r1)
            r2.f3870b = r3
            return
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: a */
    public static p023b6.C0682a m2242a(@androidx.annotation.RecentlyNonNull android.content.Context r2) {
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r2, r0)
            java.util.concurrent.locks.Lock r0 = p023b6.C0682a.f3867c
            r1 = r0
            java.util.concurrent.locks.ReentrantLock r1 = (java.util.concurrent.locks.ReentrantLock) r1
            r1.lock()
            b6.a r1 = p023b6.C0682a.f3868d     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L1c
            b6.a r1 = new b6.a     // Catch: java.lang.Throwable -> L24
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L24
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L24
            p023b6.C0682a.f3868d = r1     // Catch: java.lang.Throwable -> L24
        L1c:
            b6.a r2 = p023b6.C0682a.f3868d     // Catch: java.lang.Throwable -> L24
            java.util.concurrent.locks.ReentrantLock r0 = (java.util.concurrent.locks.ReentrantLock) r0
            r0.unlock()
            return r2
        L24:
            r2 = move-exception
            java.util.concurrent.locks.Lock r0 = p023b6.C0682a.f3867c
            java.util.concurrent.locks.ReentrantLock r0 = (java.util.concurrent.locks.ReentrantLock) r0
            r0.unlock()
            throw r2
    }

    @androidx.annotation.RecentlyNullable
    /* renamed from: b */
    public com.google.android.gms.auth.api.signin.GoogleSignInAccount m2243b() {
            r4 = this;
            java.lang.String r0 = "defaultGoogleSignInAccount"
            java.lang.String r0 = r4.m2244c(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto Le
            goto L34
        Le:
            r1 = 20
            int r1 = p064e.C1489c.m4038a(r0, r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.String r1 = "googleSignInAccount"
            r3.append(r1)
            java.lang.String r1 = ":"
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r0 = r4.m2244c(r0)
            if (r0 == 0) goto L34
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r2 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.m2925Y(r0)     // Catch: org.json.JSONException -> L34
        L34:
            return r2
    }

    /* renamed from: c */
    public final java.lang.String m2244c(java.lang.String r3) {
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.f3869a
            r0.lock()
            android.content.SharedPreferences r0 = r2.f3870b     // Catch: java.lang.Throwable -> L12
            r1 = 0
            java.lang.String r3 = r0.getString(r3, r1)     // Catch: java.lang.Throwable -> L12
            java.util.concurrent.locks.Lock r0 = r2.f3869a
            r0.unlock()
            return r3
        L12:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.f3869a
            r0.unlock()
            throw r3
    }
}
