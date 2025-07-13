package p341t9;

/* renamed from: t9.e */
/* loaded from: classes.dex */
public final class C6201e implements p234n7.C4693a.a {

    /* renamed from: a */
    public final /* synthetic */ p341t9.C6202f f24154a;

    public C6201e(p341t9.C6202f r1) {
            r0 = this;
            r0.f24154a = r1
            r0.<init>()
            return
    }

    @Override // p249o7.InterfaceC5090r4
    /* renamed from: a */
    public final void mo11418a(java.lang.String r2, java.lang.String r3, android.os.Bundle r4, long r5) {
            r1 = this;
            if (r2 == 0) goto L34
            java.lang.String r0 = "crash"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L34
            java.util.Set<java.lang.String> r2 = p341t9.C6198b.f24145a
            java.util.HashSet r2 = (java.util.HashSet) r2
            boolean r2 = r2.contains(r3)
            r2 = r2 ^ 1
            if (r2 == 0) goto L34
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r0 = "name"
            r2.putString(r0, r3)
            java.lang.String r3 = "timestampInMillis"
            r2.putLong(r3, r5)
            java.lang.String r3 = "params"
            r2.putBundle(r3, r4)
            t9.f r3 = r1.f24154a
            s9.a$b r3 = r3.f24155a
            r4 = 3
            z9.c r3 = (p452z9.C7261c) r3
            r3.m14339a(r4, r2)
        L34:
            return
    }
}
