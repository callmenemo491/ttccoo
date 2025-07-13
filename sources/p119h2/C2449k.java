package p119h2;

/* renamed from: h2.k */
/* loaded from: classes.dex */
public class C2449k implements p119h2.C2442d.c {

    /* renamed from: a */
    public java.io.File f10947a;

    /* renamed from: b */
    public final /* synthetic */ android.content.Context f10948b;

    public C2449k(android.content.Context r1) {
            r0 = this;
            r0.f10948b = r1
            r0.<init>()
            r1 = 0
            r0.f10947a = r1
            return
    }

    /* renamed from: a */
    public java.io.File m6225a() {
            r3 = this;
            java.io.File r0 = r3.f10947a
            if (r0 != 0) goto L13
            java.io.File r0 = new java.io.File
            android.content.Context r1 = r3.f10948b
            java.io.File r1 = r1.getCacheDir()
            java.lang.String r2 = "volley"
            r0.<init>(r1, r2)
            r3.f10947a = r0
        L13:
            java.io.File r0 = r3.f10947a
            return r0
    }
}
