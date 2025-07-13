package p388w6;

/* renamed from: w6.c */
/* loaded from: classes.dex */
public class C6816c {

    /* renamed from: b */
    public static p388w6.C6816c f26526b;

    /* renamed from: a */
    public p388w6.C6815b f26527a;

    static {
            w6.c r0 = new w6.c
            r0.<init>()
            p388w6.C6816c.f26526b = r0
            return
    }

    public C6816c() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f26527a = r0
            return
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: a */
    public static p388w6.C6815b m13887a(@androidx.annotation.RecentlyNonNull android.content.Context r2) {
            w6.c r0 = p388w6.C6816c.f26526b
            monitor-enter(r0)
            w6.b r1 = r0.f26527a     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L19
            android.content.Context r1 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto Le
            goto L12
        Le:
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L1d
        L12:
            w6.b r1 = new w6.b     // Catch: java.lang.Throwable -> L1d
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1d
            r0.f26527a = r1     // Catch: java.lang.Throwable -> L1d
        L19:
            w6.b r2 = r0.f26527a     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)
            return r2
        L1d:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }
}
