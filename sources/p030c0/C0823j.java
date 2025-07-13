package p030c0;

/* renamed from: c0.j */
/* loaded from: classes.dex */
public class C0823j {

    /* renamed from: a */
    public final android.os.Bundle f4446a;

    /* renamed from: b */
    public androidx.core.graphics.drawable.IconCompat f4447b;

    /* renamed from: c */
    public final p030c0.C0832s[] f4448c;

    /* renamed from: d */
    public final p030c0.C0832s[] f4449d;

    /* renamed from: e */
    public boolean f4450e;

    /* renamed from: f */
    public boolean f4451f;

    /* renamed from: g */
    public final int f4452g;

    /* renamed from: h */
    public final boolean f4453h;

    /* renamed from: i */
    @java.lang.Deprecated
    public int f4454i;

    /* renamed from: j */
    public java.lang.CharSequence f4455j;

    /* renamed from: k */
    public android.app.PendingIntent f4456k;

    public C0823j(int r13, java.lang.CharSequence r14, android.app.PendingIntent r15) {
            r12 = this;
            r0 = 0
            if (r13 != 0) goto L4
            goto La
        L4:
            java.lang.String r1 = ""
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.m1008b(r0, r1, r13)
        La:
            r2 = r0
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            r6 = 0
            r7 = 0
            r8 = 1
            r9 = 0
            r10 = 1
            r11 = 0
            r1 = r12
            r3 = r14
            r4 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public C0823j(androidx.core.graphics.drawable.IconCompat r3, java.lang.CharSequence r4, android.app.PendingIntent r5, android.os.Bundle r6, p030c0.C0832s[] r7, p030c0.C0832s[] r8, boolean r9, int r10, boolean r11, boolean r12) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.f4451f = r0
            r2.f4447b = r3
            if (r3 == 0) goto L17
            int r0 = r3.m1011e()
            r1 = 2
            if (r0 != r1) goto L17
            int r3 = r3.m1009c()
            r2.f4454i = r3
        L17:
            java.lang.CharSequence r3 = p030c0.C0826m.m2482b(r4)
            r2.f4455j = r3
            r2.f4456k = r5
            if (r6 == 0) goto L22
            goto L27
        L22:
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
        L27:
            r2.f4446a = r6
            r2.f4448c = r7
            r2.f4449d = r8
            r2.f4450e = r9
            r2.f4452g = r10
            r2.f4451f = r11
            r2.f4453h = r12
            return
    }

    /* renamed from: a */
    public androidx.core.graphics.drawable.IconCompat m2474a() {
            r3 = this;
            androidx.core.graphics.drawable.IconCompat r0 = r3.f4447b
            if (r0 != 0) goto L11
            int r0 = r3.f4454i
            if (r0 == 0) goto L11
            r1 = 0
            java.lang.String r2 = ""
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.m1008b(r1, r2, r0)
            r3.f4447b = r0
        L11:
            androidx.core.graphics.drawable.IconCompat r0 = r3.f4447b
            return r0
    }
}
