package p127ha;

/* renamed from: ha.b */
/* loaded from: classes.dex */
public class C2995b {

    /* renamed from: a */
    public int f12087a;

    /* renamed from: b */
    public java.lang.String f12088b;

    public C2995b(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f12087a = r1
            r0.f12088b = r2
            return
    }

    public C2995b(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f12088b = r1
            r1 = 0
            r0.f12087a = r1
            return
    }

    public C2995b(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f12088b = r1
            r0.f12087a = r2
            return
    }

    /* renamed from: a */
    public java.lang.String m7366a() {
            r1 = this;
            int r0 = r1.f12087a
            if (r0 != 0) goto L7
            java.lang.String r0 = ""
            return r0
        L7:
            r1.m7368c()
            java.lang.String r0 = r1.f12088b
            return r0
    }

    /* renamed from: b */
    public java.lang.String m7367b() {
            r4 = this;
            int r0 = r4.f12087a
            r1 = -1
            if (r0 != r1) goto L7
            r0 = 0
            return r0
        L7:
            java.lang.String r2 = r4.f12088b
            r3 = 46
            int r0 = r2.indexOf(r3, r0)
            if (r0 != r1) goto L1c
            java.lang.String r0 = r4.f12088b
            int r2 = r4.f12087a
            java.lang.String r0 = r0.substring(r2)
            r4.f12087a = r1
            return r0
        L1c:
            java.lang.String r1 = r4.f12088b
            int r2 = r4.f12087a
            java.lang.String r1 = r1.substring(r2, r0)
            int r0 = r0 + 1
            r4.f12087a = r0
            return r1
    }

    /* renamed from: c */
    public void m7368c() {
            r2 = this;
            java.lang.String r0 = r2.f12088b
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Value is null, and cannot be converted to the desired type."
            r0.<init>(r1)
            throw r0
    }
}
