package p145i7;

/* renamed from: i7.f */
/* loaded from: classes.dex */
public final class C3097f implements qa.InterfaceC5611h {

    /* renamed from: a */
    public boolean f12482a;

    /* renamed from: b */
    public boolean f12483b;

    /* renamed from: c */
    public qa.C5607d f12484c;

    /* renamed from: d */
    public final p145i7.C3094c f12485d;

    public C3097f(p145i7.C3094c r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f12482a = r0
            r1.f12483b = r0
            r1.f12485d = r2
            return
    }

    @Override // qa.InterfaceC5611h
    /* renamed from: a */
    public final qa.InterfaceC5611h mo7567a(java.lang.String r4) {
            r3 = this;
            boolean r0 = r3.f12482a
            if (r0 != 0) goto L11
            r0 = 1
            r3.f12482a = r0
            i7.c r0 = r3.f12485d
            qa.d r1 = r3.f12484c
            boolean r2 = r3.f12483b
            r0.m7556a(r1, r4, r2)
            return r3
        L11:
            qa.c r4 = new qa.c
            java.lang.String r0 = "Cannot encode a second value in the ValueEncoderContext"
            r4.<init>(r0)
            throw r4
    }

    @Override // qa.InterfaceC5611h
    /* renamed from: b */
    public final qa.InterfaceC5611h mo7568b(boolean r4) {
            r3 = this;
            boolean r0 = r3.f12482a
            if (r0 != 0) goto L11
            r0 = 1
            r3.f12482a = r0
            i7.c r0 = r3.f12485d
            qa.d r1 = r3.f12484c
            boolean r2 = r3.f12483b
            r0.m7557b(r1, r4, r2)
            return r3
        L11:
            qa.c r4 = new qa.c
            java.lang.String r0 = "Cannot encode a second value in the ValueEncoderContext"
            r4.<init>(r0)
            throw r4
    }
}
