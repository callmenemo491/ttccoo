package com.google.android.gms.common.internal;

/* renamed from: com.google.android.gms.common.internal.a */
/* loaded from: classes.dex */
public final class C1101a {
    /* renamed from: a */
    public static void m3096a(boolean r0) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
    }

    /* renamed from: b */
    public static void m3097b(boolean r0, @androidx.annotation.RecentlyNonNull java.lang.Object r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: c */
    public static void m3098c(@androidx.annotation.RecentlyNonNull android.os.Handler r5) {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = r5.getLooper()
            if (r0 == r1) goto L44
            if (r0 == 0) goto L15
            java.lang.Thread r0 = r0.getThread()
            java.lang.String r0 = r0.getName()
            goto L17
        L15:
            java.lang.String r0 = "null current looper"
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            android.os.Looper r5 = r5.getLooper()
            java.lang.Thread r5 = r5.getThread()
            java.lang.String r5 = r5.getName()
            r2 = 36
            int r2 = p064e.C1489c.m4038a(r5, r2)
            int r2 = p064e.C1489c.m4038a(r0, r2)
            java.lang.String r3 = "Must be called on "
            java.lang.String r4 = " thread, but got "
            java.lang.StringBuilder r5 = p064e.C1491e.m4040a(r2, r3, r5, r4, r0)
            java.lang.String r0 = "."
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5)
            throw r1
        L44:
            return
    }

    /* renamed from: d */
    public static void m3099d(@androidx.annotation.RecentlyNonNull java.lang.String r2) {
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L10
            return
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
    }

    @androidx.annotation.RecentlyNonNull
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    /* renamed from: e */
    public static java.lang.String m3100e(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Given String is empty or null"
            r1.<init>(r0)
            throw r1
    }

    @androidx.annotation.RecentlyNonNull
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    /* renamed from: f */
    public static java.lang.String m3101f(java.lang.String r1, @androidx.annotation.RecentlyNonNull java.lang.Object r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            throw r1
    }

    /* renamed from: g */
    public static void m3102g(@androidx.annotation.RecentlyNonNull java.lang.String r2) {
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 != 0) goto L10
            return
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    /* renamed from: h */
    public static <T> T m3103h(T r1) {
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r1, r0)
            return r1
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    /* renamed from: i */
    public static <T> T m3104i(@androidx.annotation.RecentlyNonNull T r0, @androidx.annotation.RecentlyNonNull java.lang.Object r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: j */
    public static void m3105j(boolean r0) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    /* renamed from: k */
    public static void m3106k(boolean r0, @androidx.annotation.RecentlyNonNull java.lang.Object r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }
}
