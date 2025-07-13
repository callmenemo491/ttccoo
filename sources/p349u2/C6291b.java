package p349u2;

/* renamed from: u2.b */
/* loaded from: classes.dex */
public class C6291b implements p214m2.InterfaceC4345w<byte[]> {

    /* renamed from: Y */
    public final byte[] f24537Y;

    public C6291b(byte[] r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Argument must not be null"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f24537Y = r2
            return
    }

    @Override // p214m2.InterfaceC4345w
    /* renamed from: a */
    public int mo9718a() {
            r1 = this;
            byte[] r0 = r1.f24537Y
            int r0 = r0.length
            return r0
    }

    @Override // p214m2.InterfaceC4345w
    /* renamed from: c */
    public java.lang.Class<byte[]> mo9720c() {
            r1 = this;
            java.lang.Class<byte[]> r0 = byte[].class
            return r0
    }

    @Override // p214m2.InterfaceC4345w
    /* renamed from: d */
    public void mo9721d() {
            r0 = this;
            return
    }

    @Override // p214m2.InterfaceC4345w
    public byte[] get() {
            r1 = this;
            byte[] r0 = r1.f24537Y
            return r0
    }
}
