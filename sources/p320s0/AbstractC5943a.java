package p320s0;

@android.annotation.SuppressLint({"BanParcelableUsage"})
/* renamed from: s0.a */
/* loaded from: classes.dex */
public abstract class AbstractC5943a implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p320s0.AbstractC5943a> CREATOR = null;

    /* renamed from: Z */
    public static final p320s0.AbstractC5943a f22818Z = null;

    /* renamed from: Y */
    public final android.os.Parcelable f22819Y;

    /* renamed from: s0.a$a */
    public class a extends p320s0.AbstractC5943a {
        public a() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }
    }

    /* renamed from: s0.a$b */
    public class b implements android.os.Parcelable.ClassLoaderCreator<p320s0.AbstractC5943a> {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public java.lang.Object createFromParcel(android.os.Parcel r2) {
                r1 = this;
                r0 = 0
                android.os.Parcelable r2 = r2.readParcelable(r0)
                if (r2 != 0) goto La
                s0.a r2 = p320s0.AbstractC5943a.f22818Z
                return r2
            La:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "superState must be null"
                r2.<init>(r0)
                throw r2
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public p320s0.AbstractC5943a createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                android.os.Parcelable r1 = r1.readParcelable(r2)
                if (r1 != 0) goto L9
                s0.a r1 = p320s0.AbstractC5943a.f22818Z
                return r1
            L9:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "superState must be null"
                r1.<init>(r2)
                throw r1
        }

        @Override // android.os.Parcelable.Creator
        public java.lang.Object[] newArray(int r1) {
                r0 = this;
                s0.a[] r1 = new p320s0.AbstractC5943a[r1]
                return r1
        }
    }

    static {
            s0.a$a r0 = new s0.a$a
            r0.<init>()
            p320s0.AbstractC5943a.f22818Z = r0
            s0.a$b r0 = new s0.a$b
            r0.<init>()
            p320s0.AbstractC5943a.CREATOR = r0
            return
    }

    public AbstractC5943a(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>()
            android.os.Parcelable r1 = r1.readParcelable(r2)
            if (r1 == 0) goto La
            goto Lc
        La:
            s0.a r1 = p320s0.AbstractC5943a.f22818Z
        Lc:
            r0.f22819Y = r1
            return
    }

    public AbstractC5943a(android.os.Parcelable r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto Le
            s0.a r0 = p320s0.AbstractC5943a.f22818Z
            if (r2 == r0) goto La
            goto Lb
        La:
            r2 = 0
        Lb:
            r1.f22819Y = r2
            return
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "superState must not be null"
            r2.<init>(r0)
            throw r2
    }

    public AbstractC5943a(p320s0.AbstractC5943a.a r1) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.f22819Y = r1
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            android.os.Parcelable r0 = r1.f22819Y
            r2.writeParcelable(r0, r3)
            return
    }
}
