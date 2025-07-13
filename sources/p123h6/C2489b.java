package p123h6;

/* renamed from: h6.b */
/* loaded from: classes.dex */
public class C2489b {

    /* renamed from: a */
    @androidx.annotation.RecentlyNonNull
    public final java.lang.String f11253a;

    /* renamed from: b */
    public final boolean f11254b;

    /* renamed from: c */
    public java.lang.String f11255c;

    public C2489b(@androidx.annotation.RecentlyNonNull java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "The log tag cannot be null or empty."
            com.google.android.gms.common.internal.C1101a.m3101f(r2, r0)
            r1.f11253a = r2
            int r2 = r2.length()
            r0 = 23
            if (r2 > r0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            r1.f11254b = r2
            return
    }

    /* renamed from: a */
    public void m6376a(@androidx.annotation.RecentlyNonNull java.lang.String r2, @androidx.annotation.RecentlyNonNull java.lang.Object... r3) {
            r1 = this;
            boolean r0 = r1.m6381f()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = r1.f11253a
            java.lang.String r2 = r1.m6380e(r2, r3)
            android.util.Log.d(r0, r2)
            return
    }

    /* renamed from: b */
    public void m6377b(@androidx.annotation.RecentlyNonNull java.lang.Throwable r2, @androidx.annotation.RecentlyNonNull java.lang.String r3, @androidx.annotation.RecentlyNonNull java.lang.Object... r4) {
            r1 = this;
            boolean r0 = r1.m6381f()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = r1.f11253a
            java.lang.String r3 = r1.m6380e(r3, r4)
            android.util.Log.d(r0, r3, r2)
            return
    }

    /* renamed from: c */
    public void m6378c(@androidx.annotation.RecentlyNonNull java.lang.String r2, @androidx.annotation.RecentlyNonNull java.lang.Object... r3) {
            r1 = this;
            java.lang.String r0 = r1.f11253a
            java.lang.String r2 = r1.m6380e(r2, r3)
            android.util.Log.e(r0, r2)
            return
    }

    /* renamed from: d */
    public void m6379d(@androidx.annotation.RecentlyNonNull java.lang.String r2, @androidx.annotation.RecentlyNonNull java.lang.Object... r3) {
            r1 = this;
            java.lang.String r0 = r1.f11253a
            java.lang.String r2 = r1.m6380e(r2, r3)
            android.util.Log.w(r0, r2)
            return
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: e */
    public final java.lang.String m6380e(@androidx.annotation.RecentlyNonNull java.lang.String r2, @androidx.annotation.RecentlyNonNull java.lang.Object... r3) {
            r1 = this;
            int r0 = r3.length
            if (r0 == 0) goto L9
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = java.lang.String.format(r0, r2, r3)
        L9:
            java.lang.String r3 = r1.f11255c
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L2b
            java.lang.String r3 = r1.f11255c
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r0 = r2.length()
            if (r0 == 0) goto L26
            java.lang.String r2 = r3.concat(r2)
            goto L2b
        L26:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r3)
        L2b:
            return r2
    }

    /* renamed from: f */
    public final boolean m6381f() {
            r3 = this;
            boolean r0 = r3.f11254b
            r1 = 0
            if (r0 == 0) goto L10
            java.lang.String r0 = r3.f11253a
            r2 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r2)
            if (r0 == 0) goto L10
            r1 = 1
        L10:
            return r1
    }
}
