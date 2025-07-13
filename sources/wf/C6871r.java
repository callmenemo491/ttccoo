package wf;

/* renamed from: wf.r */
/* loaded from: classes.dex */
public final class C6871r extends p119h2.C2448j {
    public C6871r(java.lang.String r1, java.lang.String r2, wf.C6873t<T> r3, wf.C6874u r4) {
            r0 = this;
            r2 = 1
            r0.<init>(r2, r1, r3, r4)
            return
    }

    @Override // p105g2.AbstractC2220n
    /* renamed from: l */
    public byte[] mo116l() {
            r2 = this;
            java.nio.charset.Charset r0 = p362uh.C6455a.f25034b
            java.lang.String r1 = "{\n    \"json\": true,\n    \"code\": \"atomhubtools\",\n    \"scope\": \"atomhubtools\",\n    \"table\": \"acclists\",\n    \"lower_bound\": \"col.verify\",\n    \"upper_bound\": \"col.wlist\",\n    \"limit\": \"1000\"\n}"
            byte[] r0 = r1.getBytes(r0)
            java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
            p214m2.C4339q.m9705j(r0, r1)
            return r0
    }
}
