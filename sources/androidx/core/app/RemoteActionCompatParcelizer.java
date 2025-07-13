package androidx.core.app;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public RemoteActionCompatParcelizer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.app.RemoteActionCompat read(p367v1.AbstractC6489c r3) {
            androidx.core.app.RemoteActionCompat r0 = new androidx.core.app.RemoteActionCompat
            r0.<init>()
            androidx.core.graphics.drawable.IconCompat r1 = r0.f1949a
            r2 = 1
            boolean r2 = r3.mo13191i(r2)
            if (r2 != 0) goto Lf
            goto L13
        Lf:
            v1.e r1 = r3.m13197o()
        L13:
            androidx.core.graphics.drawable.IconCompat r1 = (androidx.core.graphics.drawable.IconCompat) r1
            r0.f1949a = r1
            java.lang.CharSequence r1 = r0.f1950b
            r2 = 2
            boolean r2 = r3.mo13191i(r2)
            if (r2 != 0) goto L21
            goto L25
        L21:
            java.lang.CharSequence r1 = r3.mo13190h()
        L25:
            r0.f1950b = r1
            java.lang.CharSequence r1 = r0.f1951c
            r2 = 3
            boolean r2 = r3.mo13191i(r2)
            if (r2 != 0) goto L31
            goto L35
        L31:
            java.lang.CharSequence r1 = r3.mo13190h()
        L35:
            r0.f1951c = r1
            android.app.PendingIntent r1 = r0.f1952d
            r2 = 4
            android.os.Parcelable r1 = r3.m13195m(r1, r2)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            r0.f1952d = r1
            boolean r1 = r0.f1953e
            r2 = 5
            boolean r2 = r3.mo13191i(r2)
            if (r2 != 0) goto L4c
            goto L50
        L4c:
            boolean r1 = r3.mo13188f()
        L50:
            r0.f1953e = r1
            boolean r1 = r0.f1954f
            r2 = 6
            boolean r2 = r3.mo13191i(r2)
            if (r2 != 0) goto L5c
            goto L60
        L5c:
            boolean r1 = r3.mo13188f()
        L60:
            r0.f1954f = r1
            return r0
    }

    public static void write(androidx.core.app.RemoteActionCompat r2, p367v1.AbstractC6489c r3) {
            java.util.Objects.requireNonNull(r3)
            androidx.core.graphics.drawable.IconCompat r0 = r2.f1949a
            r1 = 1
            r3.mo13198p(r1)
            r3.m13205w(r0)
            java.lang.CharSequence r0 = r2.f1950b
            r1 = 2
            r3.mo13198p(r1)
            r3.mo13201s(r0)
            java.lang.CharSequence r0 = r2.f1951c
            r1 = 3
            r3.mo13198p(r1)
            r3.mo13201s(r0)
            android.app.PendingIntent r0 = r2.f1952d
            r1 = 4
            r3.mo13198p(r1)
            r3.mo13203u(r0)
            boolean r0 = r2.f1953e
            r1 = 5
            r3.mo13198p(r1)
            r3.mo13199q(r0)
            boolean r2 = r2.f1954f
            r0 = 6
            r3.mo13198p(r0)
            r3.mo13199q(r2)
            return
    }
}
