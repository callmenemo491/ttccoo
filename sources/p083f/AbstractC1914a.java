package p083f;

/* renamed from: f.a */
/* loaded from: classes.dex */
public abstract class AbstractC1914a {

    /* renamed from: f.a$a */
    public static class a extends android.view.ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f8308a;

        public a(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.f8308a = r1
                r1 = 8388627(0x800013, float:1.175497E-38)
                r0.f8308a = r1
                return
        }

        public a(android.content.Context r3, android.util.AttributeSet r4) {
                r2 = this;
                r2.<init>(r3, r4)
                r0 = 0
                r2.f8308a = r0
                int[] r1 = p064e.C1495i.f7259b
                android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r1)
                int r4 = r3.getInt(r0, r0)
                r2.f8308a = r4
                r3.recycle()
                return
        }

        public a(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.f8308a = r1
                return
        }

        public a(p083f.AbstractC1914a.a r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 0
                r1.f8308a = r0
                int r2 = r2.f8308a
                r1.f8308a = r2
                return
        }
    }

    /* renamed from: f.a$b */
    public interface b {
        /* renamed from: a */
        void m4701a(boolean r1);
    }

    @java.lang.Deprecated
    /* renamed from: f.a$c */
    public static abstract class c {
        /* renamed from: a */
        public abstract void m4702a();
    }

    public AbstractC1914a() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public abstract void mo4698a(boolean r1);

    /* renamed from: b */
    public abstract android.content.Context mo4699b();

    /* renamed from: c */
    public abstract void mo4700c(boolean r1);
}
