package p089f5;

/* renamed from: f5.b */
/* loaded from: classes.dex */
public abstract class AbstractC2060b implements p427y4.C7110a.b {
    public AbstractC2060b() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p427y4.C7110a.b
    /* renamed from: D */
    public /* synthetic */ p088f4.C2003e0 mo30D() {
            r1 = this;
            f4.e0 r0 = p427y4.C7111b.m14222b(r1)
            return r0
    }

    @Override // p427y4.C7110a.b
    /* renamed from: O */
    public /* synthetic */ byte[] mo31O() {
            r1 = this;
            byte[] r0 = p427y4.C7111b.m14221a(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p427y4.C7110a.b
    /* renamed from: p */
    public /* synthetic */ void mo32p(p088f4.C2021k0.b r1) {
            r0 = this;
            p427y4.C7111b.m14223c(r0, r1)
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getSimpleName()
            int r1 = r0.length()
            java.lang.String r2 = "SCTE-35 splice command: type="
            if (r1 == 0) goto L15
            java.lang.String r0 = r2.concat(r0)
            goto L1a
        L15:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L1a:
            return r0
    }
}
