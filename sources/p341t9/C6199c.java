package p341t9;

/* renamed from: t9.c */
/* loaded from: classes.dex */
public final class C6199c implements p234n7.C4693a.a {

    /* renamed from: a */
    public final /* synthetic */ p341t9.C6200d f24151a;

    public C6199c(p341t9.C6200d r1) {
            r0 = this;
            r0.f24151a = r1
            r0.<init>()
            return
    }

    @Override // p249o7.InterfaceC5090r4
    /* renamed from: a */
    public final void mo11418a(java.lang.String r1, java.lang.String r2, android.os.Bundle r3, long r4) {
            r0 = this;
            t9.d r1 = r0.f24151a
            java.util.Set<java.lang.String> r1 = r1.f24152a
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto Lb
            return
        Lb:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.util.Set<java.lang.String> r3 = p341t9.C6198b.f24145a
            java.lang.String r3 = p249o7.C5066o4.m11378a(r2)
            if (r3 == 0) goto L19
            r2 = r3
        L19:
            java.lang.String r3 = "events"
            r1.putString(r3, r2)
            t9.d r2 = r0.f24151a
            s9.a$b r2 = r2.f24153b
            r3 = 2
            z9.c r2 = (p452z9.C7261c) r2
            r2.m14339a(r3, r1)
            return
    }
}
