package th;

/* renamed from: th.i */
/* loaded from: classes.dex */
public class C6251i extends p074e9.C1805a {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: th.i$a */
    public static final class a<T> implements th.InterfaceC6246d<T> {

        /* renamed from: a */
        public final /* synthetic */ java.util.Iterator f24237a;

        public a(java.util.Iterator r1) {
                r0 = this;
                r0.f24237a = r1
                r0.<init>()
                return
        }

        @Override // th.InterfaceC6246d
        public java.util.Iterator<T> iterator() {
                r1 = this;
                java.util.Iterator r0 = r1.f24237a
                return r0
        }
    }

    /* renamed from: D */
    public static final <T> th.InterfaceC6246d<T> m12832D(java.util.Iterator<? extends T> r2) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r2, r0)
            th.i$a r1 = new th.i$a
            r1.<init>(r2)
            p214m2.C4339q.m9706k(r1, r0)
            boolean r2 = r1 instanceof th.C6243a
            if (r2 == 0) goto L12
            goto L18
        L12:
            th.a r2 = new th.a
            r2.<init>(r1)
            r1 = r2
        L18:
            return r1
    }
}
