package p306r6;

/* renamed from: r6.a */
/* loaded from: classes.dex */
public class C5797a {

    /* renamed from: a */
    public final java.lang.String f22479a;

    /* renamed from: b */
    public final java.lang.String f22480b;

    /* renamed from: c */
    public final int f22481c;

    public C5797a(@androidx.annotation.RecentlyNonNull java.lang.String r7, @androidx.annotation.RecentlyNonNull java.lang.String... r8) {
            r6 = this;
            int r0 = r8.length
            if (r0 != 0) goto L6
            java.lang.String r8 = ""
            goto L32
        L6:
            r0 = 91
            java.lang.StringBuilder r0 = p367v1.C6487a.m13176a(r0)
            int r1 = r8.length
            r2 = 0
        Le:
            if (r2 >= r1) goto L24
            r3 = r8[r2]
            int r4 = r0.length()
            r5 = 1
            if (r4 <= r5) goto L1e
            java.lang.String r4 = ","
            r0.append(r4)
        L1e:
            r0.append(r3)
            int r2 = r2 + 1
            goto Le
        L24:
            r8 = 93
            r0.append(r8)
            r8 = 32
            r0.append(r8)
            java.lang.String r8 = r0.toString()
        L32:
            r6.<init>()
            r6.f22480b = r8
            r6.f22479a = r7
            o6.j r8 = new o6.j
            r0 = 0
            r8.<init>(r7, r0)
            r7 = 2
        L40:
            r8 = 7
            if (r8 < r7) goto L4e
            java.lang.String r8 = r6.f22479a
            boolean r8 = android.util.Log.isLoggable(r8, r7)
            if (r8 != 0) goto L4e
            int r7 = r7 + 1
            goto L40
        L4e:
            r6.f22481c = r7
            return
    }

    /* renamed from: a */
    public void m12160a(@androidx.annotation.RecentlyNonNull java.lang.String r3, java.lang.Object... r4) {
            r2 = this;
            int r0 = r2.f22481c
            r1 = 3
            if (r0 > r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            if (r0 == 0) goto L13
            java.lang.String r0 = r2.f22479a
            java.lang.String r3 = r2.m12162c(r3, r4)
            android.util.Log.d(r0, r3)
        L13:
            return
    }

    /* renamed from: b */
    public void m12161b(@androidx.annotation.RecentlyNonNull java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            java.lang.String r0 = r1.f22479a
            java.lang.String r2 = r1.m12162c(r2, r3)
            android.util.Log.e(r0, r2)
            return
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: c */
    public java.lang.String m12162c(@androidx.annotation.RecentlyNonNull java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            if (r3 == 0) goto Lb
            int r0 = r3.length
            if (r0 <= 0) goto Lb
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = java.lang.String.format(r0, r2, r3)
        Lb:
            java.lang.String r3 = r1.f22480b
            java.lang.String r2 = r3.concat(r2)
            return r2
    }

    /* renamed from: d */
    public void m12163d(@androidx.annotation.RecentlyNonNull java.lang.String r3, java.lang.Object... r4) {
            r2 = this;
            int r0 = r2.f22481c
            r1 = 2
            if (r0 > r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            if (r0 == 0) goto L13
            java.lang.String r0 = r2.f22479a
            java.lang.String r3 = r2.m12162c(r3, r4)
            android.util.Log.v(r0, r3)
        L13:
            return
    }

    /* renamed from: e */
    public void m12164e(@androidx.annotation.RecentlyNonNull java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            java.lang.String r0 = r1.f22479a
            java.lang.String r2 = r1.m12162c(r2, r3)
            android.util.Log.w(r0, r2)
            return
    }
}
